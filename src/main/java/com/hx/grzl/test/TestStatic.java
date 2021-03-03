package com.hx.grzl.test;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2021-01-27 16:01
 **/
public class TestStatic {

     static String name;
    public String school;

    public void showName(){
        this.name = "Jack";
        System.out.println(name);
    }

    public static void showSchool(){
        System.out.println(name);
    }

    public static void main(String[] args) {
//        new TestStatic().showName();
        System.out.println(TestStatic.name);
    }
}
