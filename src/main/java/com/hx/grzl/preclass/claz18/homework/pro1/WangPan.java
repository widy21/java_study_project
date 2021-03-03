package com.hx.grzl.preclass.claz18.homework.pro1;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2021-03-03 11:35
 **/
public class WangPan {
    private static String a;
    private String b;
    private static String c;
    private static String d;

    public WangPan(){
        System.out.println("wangpan");
    }
    static {
        WangPan.a = "static--a";
        System.out.println(a);
        WangPan wang = new WangPan();
        wang.test();
        wang.b = "static--b";
        System.out.println(wang.b);
    }
    static {
        WangPan.c = "static--c";
        System.out.println(c);
    }

    public static void main(String[] args) {
        // to do something...
        WangPan wang = new WangPan();
    }

    static {
        WangPan.d = "static--d";
        System.out.println(a);
    }

    public void test() {
        System.out.println("this is test");
    }
}
