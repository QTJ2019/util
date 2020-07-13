package com.jian.util.collectionpractice;

import java.util.Stack;

/**
 * @Author: qtj
 * @Date: 2020/7/10 15:46
 * @Version
 */
public class StackPractice {
    public static void main(String[] args) {
        Stack<String> stack =new Stack<String>();
        stack.push("hao");
        stack.push("ni");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
