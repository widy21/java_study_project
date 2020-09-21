package com.hx.grzl.class3;

import java.util.Scanner;

/**
 * 习题12：输入3个数字，达到3个数字求和，结束程序
 **/
public class ControlTest12 {

    public static void main(String[] args) {
        int count = 0; //数字个数
        int sum = 0; //数字之和
        while (count < 3) {

            Scanner input = new Scanner(System.in);
            System.out.println("请输入：");
            String line = input.nextLine();
            System.out.println("输入的内容是：" + line);
            sum += Integer.parseInt(line);
            count++;
        }
        System.out.println("sum=" + sum);

    }
}
