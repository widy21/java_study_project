package com.hx.grzl.class2;

import java.util.Scanner;

/**
 * 22、输入一个年份，输出是否为闰年
 * 是闰年的条件：
 * 能被4整数但不能被100整除，或者能被400整除的年份都是闰年
 **/
public class HomeWorkNo22 {
    public static void main(String[] args) {
        System.out.println("please input the year:");
        Scanner sc3 = new Scanner(System.in);
        String word = new String();
        word = sc3.nextLine();
        int year = Integer.parseInt(word);
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("是闰年.");
        }
        else {
            System.out.println("不是闰年");
        }
    }
}
