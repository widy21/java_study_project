package com.hx.grzl.class2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 课后习题19 、输入一个正整数，输出其阶乘结果
 * number = int(input("input the number: "))
 * result = 1
 * for i in range(1,number + 1):
 * result *= i
 * print(result)
 **/
public class HomeWorkNo19 {
    public static void main(String[] args) {

        System.out.println("input the number: ");
        Scanner sc = new Scanner(System.in);
        String str = new String();
        str = sc.nextLine();
        int num = Integer.parseInt(str);
        int result = 1;
        for (int i = 1; i < num + 1; i++) {
            result *= i;

        }
        System.out.println(result);
    }
}
