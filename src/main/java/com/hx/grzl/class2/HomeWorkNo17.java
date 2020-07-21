package com.hx.grzl.class2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 课后习题17、输入5个名字，排序后输出
 **/
public class HomeWorkNo17 {
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
