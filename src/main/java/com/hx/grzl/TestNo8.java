package com.hx.grzl;

/**
 * 习题8： 26个字母大小写成对打印，例如：Aa,Bb...
 * Created by huaxiao on 2020/4/6.
 */
public class TestNo8 {
    public static void main(String[] args) {
        for (int i = 65; i < 91; i++) {
            System.out.print(String.valueOf((char)(i))+(char)(i+32));
        }
        System.out.println();
    }
}
