package com.hx.grzl;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 课后习题18、实现一个简单的单词本
 * - 功能：
 * - 可以添加单词和词义，当所添加的单词已存在，让用户知道；
 * - 可以查找单词，当查找的单词不存在时，让用户知道；
 * - 可以删除单词，当删除的单词不存在时，让用户知道；
 * - 以上功能可以无限制操作，直到用户输入bye退出程序。
 **/
public class HomeWorkNo18 {
    public static void main(String[] args) {
        System.out.println("please input the five name sep by , : ");

        Scanner sc = new Scanner(System.in);
        String str = new String();
        str = sc.nextLine();
        System.out.println("names: " + str);
        String[] arr = str.split(",");
        Arrays.sort(arr);
        System.out.println("result="+Arrays.asList(arr));
    }
}
