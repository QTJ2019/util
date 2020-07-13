package com.jian.util.collectionpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author: qtj
 * @Date: 2020/7/2 14:29
 * @Version
 */
public class ArrayListPractice {
    public static void main(String[] args) {
        String temp = "add";
        test1();
    }

    public static void test1() {
        List<String> list = Arrays.asList("id", "name");
        System.out.println(list.size());
    }
}
