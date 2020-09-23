package com.hx.grzl.class3;

import java.util.Scanner;

/**
 * 习题14：用遍历二维数组的方式，遍历输出一个矩阵
 * 方式1：
 *
 * l = [
 *      [1,2,3],
 *      [4,5,6],
 *      [7,8,9]
 * ]
 **/
public class ControlTest14 {

    public static void main(String[] args) {
        // 定义二维数组
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr.length; k++) {
                System.out.println(arr[j][k]);

            }

        }

    }
}
