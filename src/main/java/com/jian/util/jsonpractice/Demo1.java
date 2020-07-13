package com.jian.util.jsonpractice;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.*;
import com.jian.entity.Person;
import com.jian.entity.ProjectModel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @Author: qtj
 * @Date: 2020/7/1 14:10
 * @Version
 */
public class Demo1 {
    public static void main(String[] args) throws Exception{
        //test1();
        //test2();
        //test3();
        test4();
    }

    public static void test1() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();

        //使用readValue方法将Json字符串转为对象
        String test1 = "{" +
                "\"name\":\"qtj\", " +
                "\"age\":20, " +
                "\"number\":123 " +
                /*   "\",address\":{\"province\":\"广东省\"，\"city\":\"佛山市\" }" +  */  //只能转基本类型属性
                "}";
        Person person = objectMapper.readValue(test1, Person.class);
        System.out.println(person.toString());
    }

    /**
     * 将json数组转换为对象数组，方法1
     * 对象的属性名要与json里面的属性名一致
     * @throws Exception
     */
    public static void test2() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();

        //生成Json字符串
//        String str1 = objectMapper.writeValueAsString(new Person("qtj", 12, 123));
//        System.out.println(str1);
//        String str2 = objectMapper.writeValueAsString(new Person("qtjj", 13, 1234));
//        System.out.println(str2);

        //Person需要具有无参的构造方法
        String str3 = "[{\"name\":\"qtj\",\"age\":12,\"number\":123,\"address\":null}," +
                "{\"name\":\"qtjj\",\"age\":13,\"number\":1234,\"address\":null}]";
        List<Person>  list = objectMapper.readValue(str3, new TypeReference<List<Person>>() {
        });
        System.out.println(list.size());
    }

    /**
     * 使用fastJson来解析json数组
     * @throws Exception
     */
    public static void test3() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        //使用JsonNode读取Json字符串的节点
        String str = "{\"result\":[ {\n" +
                "                \"id\": 151,\n" +
                "                \"project_id\": \"2020-010\",\n" +
                "                \"project_name\": \"项目-010\",\n" +
                "                \"status\": 2,\n" +
                "                \"work_date\": \"2020-07-02\",\n" +
                "                \"normal_durate\": 2.0,\n" +
                "                \"extra_durate\": 1.0,\n" +
                "                \"apply_time\": \"2020-07-02 08:52:39\"\n" +
                "            }], \"age\":\"10\"}";
        JsonNode node = objectMapper.readValue(str, JsonNode.class);

        //用asText解析普通类型的节点
        JsonNode ageNode = node.get("age");
        System.out.println(ageNode.asText().toString());

        //当JsonNode为数组时可以直接输出
        JsonNode temp = node.get("result");
        System.out.println(node.get("result"));

        //将Json数组转换成队形数组(使用了阿里的fastjson)
        JSONArray array = JSONArray.parseArray(temp.toString());
        List<ProjectModel> list = new ArrayList<ProjectModel>();
        for (int i = 0; i < array.size(); i++) {
            JSONObject jsonObject = array.getJSONObject(i);
            ProjectModel projectModel = JSONObject.parseObject(jsonObject.toJSONString(), ProjectModel.class);
            list.add(projectModel);
            System.out.println();
        }
    }

    /**
     * 使用gson来解析json数组,当Json对象的字段与Java对象的属性名称不一致时，要用@SerializedName来标注Java对象的属性
     */
    public static void test4() {
        String str = "{\"result\":[ {\n" +
                "                \"id\": 151,\n" +
                "                \"project_id\": \"2020-010\",\n" +
                "                \"project_name\": \"项目-010\",\n" +
                "                \"status\": 2,\n" +
                "                \"work_date\": \"2020-07-02\",\n" +
                "                \"normal_durate\": 2.0,\n" +
                "                \"extra_durate\": 1.0,\n" +
                "                \"apply_time\": \"2020-07-02 08:52:39\"\n" +
                "            }], \"age\":\"10\"}";


        JsonParser parser = new JsonParser();
        JsonElement element = parser.parse(str);

        if (element.isJsonObject()) {
            //获取json中的数组
           JsonObject object = element.getAsJsonObject();
            JsonArray array = object.getAsJsonArray("result");

            List<ProjectModel> list = new ArrayList<ProjectModel>();

            //将Json对象转为Java对象需要用到的类
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd hh:mm:ss").create();

            //遍历Json数组
            for (int i = 0; i < array.size(); i++) {
                JsonObject jsonObject = array.get(i).getAsJsonObject();
                ProjectModel projectModel = gson.fromJson(jsonObject, ProjectModel.class);
                list.add(projectModel);
            }
        }
    }
}
