package com.hx.grzl;

import java.util.ArrayList;
import java.util.List;

/**
 * 习题3：生成字符串a1b2c3d4e5f6g7h8i9j10
 * Created by huaxiao on 2020/3/20.
 */
public class TestNo3 {

    public static void main(String[] args) {
//        foo1();
//        foo2();
        foo3();
    }

    /**
     * 方式3
     */
    private static void foo3() {
        List<String> result = new ArrayList<>();
        int fist_letter_ascii_code = 97;
        for (int i = 1; i < 11; i++) {
            String s = (char) (fist_letter_ascii_code + i - 1) + new Integer(i).toString();
            result.add(s);
        }
        System.out.println(String.join("", result));
    }

    /**
     * 方式2：改用join拼接
     */
    private static void foo2() {
        List<String> result = new ArrayList<>();
        for (int i = 97; i < 107; i++) {
            String s = (char) (i) + new Integer(i - 96).toString();
            result.add(s);
        }
        System.out.println(String.join("", result));
    }

    /**
     * 方式1
     */
    private static void foo1() {
        String s = "";
        for (int i = 97; i < 107; i++) {
            s += (char) (i) + new Integer(i - 96).toString();
//            s += new Integer(i-96).toString();
//            System.out.println(i-96);
        }
        System.out.println(s);
    }
}
