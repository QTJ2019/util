package com.jian.util.IOpractice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: qtj
 * @Date: 2020/7/8 15:48
 * @Version
 */

/*
nextLine()以Enter为结束符,不会忽略空白字符
next()以有效字符后的空白符作为结束符，在输入有效字符前的空白符会被该方法自动去掉。
 */
public class IOPracticce {
    public static void main(String[] args) {
        test1();
        //test2();
        //test3();
        //test4();
    }

    /*
    1、hasNextInt在接收到不是整数的有效字符后会返回false
    2、预先不输入数据的组数，读取到行尾
     */
    public static void test1() {
        Scanner in = new Scanner(System.in);
        //判断接受的输入是否为整数
//        while (in.hasNextInt()){
//            int a = in.nextInt();
//            int b = in.nextInt();
//            System.out.println(a+b);
//        }

        //判断接收的输入是否为字符
        while (in.hasNext()) {
            System.out.println(in.next());
        }
    }

    /*
    预先知道组数——读组数然后读到行尾
     */
    public static void test2() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a+b);
        }
    }

    /*
    对next()的使用
     */
    public static void test3() {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            System.out.println(in.next());
        }
    }

    /*
    使用nextLine处理数据
     */
    public static void test4() {
        Scanner in = new Scanner(System.in);
        int total = in.nextInt();
        String temp = in.nextLine();
        temp = temp.substring(2,temp.length()-1);
        String[] temps = temp.split(",");
        int[] money = new int[temps.length];
        for (int i = 0; i < temps.length; i++) {
            money[i] = Integer.valueOf(temps[i]);
        }
        Arrays.sort(money);
    }
}
