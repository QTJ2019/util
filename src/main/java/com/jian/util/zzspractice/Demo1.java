package com.jian.util.zzspractice;

/**
 * @Author: qtj
 * @Date: 2020/7/2 17:32
 * @Version
 */
public class Demo1 {
    public static void main(String[] args) {
        //test1();
        test2();
    }

    public static void test1(){
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

        System.out.println(str.replaceAll("_[a-z]", "_"));
    }

    public static void test2() {
        String input = "the\tsky\tis\t\t\t\t\t\t\t\t\t\t\t\tblue!";
        //使用正则式把input里的单词拆分出来。
        String[] temp = input.split(" |\\t+");
        System.out.println("");
    }
}
