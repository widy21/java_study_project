package com.hx.grzl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 课后习题19 、输入一个正整数，输出其阶乘结果
 * number = int(input("input the number: "))
 * result = 1
 * for i in range(1,number + 1):
 *     result *= i
 * print(result)
 **/
public class HomeWorkNo19 {
    public static void main(String[] args) {

            System.out.println("input the number: ");
            Scanner sc = new Scanner(System.in);
            String command = new String();
            command = sc.nextLine();
            if (command.equals("add")) {
                System.out.println("please input the word:");
                Scanner sc1 = new Scanner(System.in);
                String word = new String();
                word = sc1.nextLine();
                if (wordListDict.containsKey(word)) {
                    System.out.println("alreay exists");
                } else {
                    System.out.println("input the word mean: ");
                    Scanner sc2 = new Scanner(System.in);
                    String wordMean = new String();
                    wordMean = sc2.nextLine();
                    wordListDict.put(word, wordMean);
                }
            }
    }
}
