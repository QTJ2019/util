package com.jian.util.collectionpractice;

import java.util.HashMap;
import com.jian.entity.ProjectModel;

/**
 * @Author: qtj
 * @Date: 2020/7/6 15:41
 * @Version
 */
public class MapPractice {
    public static void main(String[] args) {
        HashMapTest1();
    }

    public static void HashMapTest1(){
        String userId = "1";
        String projectId = "2";
        HashMap<String, Object> map = new HashMap<String,Object>(){
            {
                put("project_id", "1");
                put("user_id", "2");
            }
        };
        System.out.println(map.size());
    }
}
