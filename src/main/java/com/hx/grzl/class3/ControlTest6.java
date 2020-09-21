package com.hx.grzl.class3;

/**
 * 习题6：遍历字符串、列表，分别基于位置和和基于字符遍历
 *
 **/
public class ControlTest6 {


    public static void main(String[] args) {
        String s = "abc";
        // 基于位置
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            System.out.println(c);
        }
        System.out.println();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);

        }

        System.out.println("----------------------");

        // 基于字符
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));

        }
    }
}
