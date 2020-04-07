package com.hx.grzl;

import java.util.Random;

/**
 * 习题17：生成9位数字的密码
 * Created by huaxiao on 2020/4/7.
 */
public class TestNo17 {

    public static void main(String[] args) {
//        foo1();
        foo2();
    }

    private static void foo2() {
        String pwd = "";
        String str = "0123456789";
        for (int i = 0; i < 9; i++) {
            pwd += str.toCharArray()[new Random().nextInt(10)];
        }
        System.out.println(pwd);
    }

    private static void foo1() {
        String pwd = "";
        for (int i = 0; i < 9; i++) {
            pwd += new Random().nextInt(10);
        }
        System.out.println(pwd);
    }
}
