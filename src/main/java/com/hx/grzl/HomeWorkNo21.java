package com.hx.grzl;

import java.util.Scanner;

/**
 *
 * 21、输入3个数字，以逗号隔开，输出其中最大的数
 *
 **/
public class HomeWorkNo21 {
    public static void main(String[] args) {

        Scanner sc3 = new Scanner(System.in);
        String word = new String();
        word = sc3.nextLine();
        String[] arr = word.split(",");
        int maxNum  =Integer.parseInt(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            int tmp = Integer.parseInt(arr[i]);
            if(maxNum< tmp){
                maxNum = tmp;
            }
        }
        System.out.println(maxNum);
    }
}
