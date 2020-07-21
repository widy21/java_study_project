package com.hx.grzl;

import java.util.Scanner;

/**
 * 23 、求两个正整数m和n的最大公约数
 *
 * 如果数a能被数b整除，a就叫做b的倍数，b就叫做a的约数。
 *
 * 几个整数中公有的约数，叫做这几个数的公约数；其中最大的一个，叫做这几个数的最大公约数（greatest common divisor）。
 *
 **/
public class HomeWorkNo23 {


    /**
     * 1.使用循环
     *
     * @param a
     * @param b
     * @return
     */
    public static int getGCD1(int a, int b) {
        if (a < 0 || b < 0) {
            return -1; // 数学上不考虑负数的约数
        }
        if (b == 0) {
            return a;
        }
        while (a % b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return b;
    }

    /**
     * 2.使用递归
     *
     * @param a
     * @param b
     * @return
     */
    public static int getGCD2(int a, int b) {
        if (a < 0 || b < 0) {
            return -1; // 数学上不考虑负数的约数
        }
        if (b == 0) {
            return a;
        }
        return a % b == 0 ? b : getGCD2(b, a % b);
    }


    public static void main(String[] args) {
        int m = 100;
        int n = 24;

        System.out.println(getGCD1(m,n));
        System.out.println(getGCD2(m,n));
    }
}
