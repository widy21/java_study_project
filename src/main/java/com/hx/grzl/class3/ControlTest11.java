package com.hx.grzl.class3;

import java.util.Scanner;

/**
 * 习题11：嵌套循环输出10-50中个位带有1~5的所有数字:
 * 方法1：数字和10取余，判断是否大于0并且小于等于5
 * 方法2：将数字转换为str，取个位的字符判断字符是否在1~5内。
 *
 *
 **/
public class ControlTest11 {

    public static void main(String[] args) {
        for (int i = 10; i < 51; i++) {
            if(i%10>=1 && i%10<=5){
                System.out.println(i);
            }
        }
        System.out.println("-----------------");
        for (int i = 10; i < 51; i++) {
//            System.out.println(i);
            String s = String.valueOf(i).toCharArray()[1]+"";
            if(Integer.parseInt(s)>=1 && Integer.parseInt(s)<=5){
                System.out.println(i);
            }
        }

    }
}
