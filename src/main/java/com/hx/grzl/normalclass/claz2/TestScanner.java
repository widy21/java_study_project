package com.hx.grzl.normalclass.claz2;

import java.util.Date;
import java.util.Scanner;

/**
 * 如何从键盘获取不同类型的变量： 需要用到Scanner类
 *
 * 具体实现步骤：
 * 1、import
 * 2.实例化
 * 3.调用相关方法
 */
public class TestScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入：");
//        final String str = scanner.next();
//        System.out.println(str);
//        final Integer a = scanner.nextInt();
//        System.out.println(a);

//        System.out.println("请输入你的姓名：");
//        String name = scanner.next();
//        System.out.println(name);
//
//        System.out.println("请输入你的年龄：");
//        int age = scanner.nextInt();
//        System.out.println(age);
//
//        System.out.println("请输入你的体重：");
//        float weight = scanner.nextFloat();
//        System.out.println(weight);
//
//        System.out.println("你是否喜欢java(true/false)：");
//        boolean isLike = scanner.nextBoolean();
//        System.out.println(isLike);

        System.out.println("请输入你的性别：");
        String sex = scanner.next();
        System.out.println(sex.charAt(0));

    }
}
