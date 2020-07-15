package com.hx.grzl;

import javax.swing.*;
import java.io.UnsupportedEncodingException;

/**
 * 十进制数字转换成二进制。
 **/
public class TestNo20 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = Integer.toBinaryString(10);
        System.out.println(s);

        toBin(10);
    }

    private static void toBin(int number) {
//        String num = JOptionPane.showInputDialog("请输入要转换的数字:");
//        int number = Integer.parseInt(num);
        System.out.println("该数的二进制数值为:");
        int sum;
        String result = "";
        for (int i = number; i >= 1; i /= 2) {
            if (i % 2 == 0) {
                sum = 0;
            } else {
                sum = 1;
            }
            result = sum + result;
        }
        System.out.print(result);
    }
}
