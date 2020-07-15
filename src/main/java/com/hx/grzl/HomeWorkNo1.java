package com.hx.grzl;

/**
 * 课后习题1. 输入1-127的ascii码并输出对应字符
 **/
public class HomeWorkNo1 {
    public static void main(String[] args) {
        for (int i = 0; i < 128; i++) {
            System.out.println(i+"="+(char)(i));

        }
    }
}
