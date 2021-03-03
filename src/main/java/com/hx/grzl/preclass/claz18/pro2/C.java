package com.hx.grzl.preclass.claz18.pro2;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2021-03-02 17:11
 **/
public class C {
    static String s = "aaa";
    static int t = 1;

    public static void main(String[] args) {
        System.out.println(C.s);
        System.out.println(new C().s);
        System.out.println(new C().t);
    }
}
