package com.hx.grzl.class3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 习题5：嵌套数组的所有元素, 二维数组遍历。
 **/
public class ControlTest5 {


    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{11,12}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }

        }

        System.out.println();

        // 三维数组
        /*int arr1[][][] = {{{1,2},{3,4}},{{5,6},{7,8}}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                for (int k = 0; k < arr1[i][j].length; k++) {
                    System.out.println(arr1[i][j][k]);

                }

            }

        }*/
    }
}
