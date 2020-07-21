package com.hx.grzl.class2;

import java.util.Scanner;

/**
 * 20、 计算存款利息
 * - 4种方法可选：
 * - 活期，年利率为r1；
 * - 一年期定息，年利率为r2；
 * - 存两次半年期定期，年利率为r3
 * - 两年期定息，年利率为r4
 * - 现有本金1000元，请分别计算出一年后按4种方法所得到的本息和。
 * - 提示：本息= 本金+ 本金* 年利率* 存款期
 *
 **/
public class HomeWorkNo20 {
    public static void main(String[] args) {

        double r1= 0.02;
        double r2 = 0.05;
        double r3 = 0.35;
        double r4 = 0.65;
        System.out.println("活期："+1000*r1 + 1000);
        System.out.println("一年定期："+1000*r2 + 1000);
        System.out.println("两次半年定息:"+1000*r3 +1000);
        System.out.println("两年定期: "+1000*r4/2+ 1000);

    }
}
