package com.hx.grzl.class1;

import java.util.Scanner;

/**
 * 习题7：判断一个输入的句子中有多少个字母
 * Created by huaxiao on 2020/4/6.
 */
public class TestNo7 {

    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个句子：");
        String line = input.nextLine();
        System.out.println("输入的句子是：" + line);
        for (char value : line.toCharArray()) {
            if ((value >= 'a' && value <= 'z') || (value >= 'A' && value <= 'Z')) {
                count += 1;
            }
        }
        System.out.println(count);

    }
}
