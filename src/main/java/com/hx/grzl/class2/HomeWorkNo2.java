package com.hx.grzl.class2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 课后习题2、输入a，b，c，d4个整数，计算a+b-c*d的结果
 **/
public class HomeWorkNo2 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            Scanner sc=new Scanner(System.in);
            String str=new String();
            str=sc.nextLine();
            System.out.println(str);
            arr[i] = Integer.parseInt(str.trim());
        }

        // 1+2-3*4 = -9
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]+arr[1]-arr[2]*arr[3]);
    }
}
