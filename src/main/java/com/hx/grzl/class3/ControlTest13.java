package com.hx.grzl.class3;

import java.util.Scanner;

/**
 * 习题13、 用户输入不同的数据，当输入的数据达到3个数字的时候，求和结束程序。（数字可以是整数）
 **/
public class ControlTest13 {

    public static void main(String[] args) {
        int count = 0; //数字个数
        int sum = 0; //数字之和
        while (count < 3) {
            Scanner input = new Scanner(System.in);
            System.out.println("请输入：");
            String line = input.nextLine();
            System.out.println("输入的内容是：" + line);
            // 如果类型转换异常，说明输入的不是整数
            try {
                sum += Integer.parseInt(line);
            } catch (Exception e) {
                System.out.println("输入的不是整数："+e.getMessage());
            }
            count++;
        }
        System.out.println("sum=" + sum);

    }
}
