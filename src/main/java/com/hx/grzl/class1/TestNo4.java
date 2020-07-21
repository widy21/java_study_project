package com.hx.grzl.class1;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: hx-demo
 * @description: 习题4：生成字符串a1B2c3D4e5F6g7H8i9J10
 * @author: huaxiao
 * @create: 2020-04-01 21:57
 **/
public class TestNo4 {

    /**
     * 方式1
     */
    private static void foo1() {
        String s = "";
        for (int i = 97; i < 107; i++) {
            if (i % 2 == 0) {
                s += String.valueOf((char) (i)).toUpperCase() + new Integer(i - 96).toString();
            } else {
                s += (char) (i) + new Integer(i - 96).toString();
            }
        }
        System.out.println(s);
    }

    /**
     * 方式2
     */
    private static void foo2() {
        String s = "";
        for (int i = 97; i < 107; i++) {
            if (i % 2 == 0) {
                s += (char) (i - 32) + new Integer(i - 96).toString();
            } else {
                s += (char) (i) + new Integer(i - 96).toString();
            }
        }
        System.out.println(s);
    }

    /**
     * 方式3
     */
    private static void foo3() {
        List<String> result = new ArrayList<>();
        for (int i = 97; i < 107; i++) {
            if (i % 2 == 0) {
                String s = (char) (i - 32) + new Integer(i - 96).toString();
                result.add(s);
            } else {
                String s = (char) (i) + new Integer(i - 96).toString();
                result.add(s);
            }
        }
        System.out.println(String.join("", result));
    }

    /**
     * 方式4
     */
    private static void foo4() {
        List<String> result = new ArrayList<>();
        int fist_letter_ascii_code = 97;
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                String s = (char) (fist_letter_ascii_code + i - 1 - 32) + new Integer(i).toString();
                result.add(s);
            } else {
                String s = (char) (fist_letter_ascii_code + i - 1) + new Integer(i).toString();
                result.add(s);
            }
        }
        System.out.println(String.join("", result));
    }

    public static void main(String[] args) {
//        foo1();
//        foo2();
//        foo3();
        foo4();
    }
}
