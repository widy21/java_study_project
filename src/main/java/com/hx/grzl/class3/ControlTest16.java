package com.hx.grzl.class3;

/**
 *习题16：求矩阵四边元素之和
 *sum=65
 * {
 * {1, 2, 3,},
 * {4, 5, 6 },
 * {7, 8, 9 },
 * {10,11,12}
 * };
 *
 * 方法：
 * 1、第1行和第5行所有元素求和
 * 2、其他行 只要第1列和第5列求和
 *
 **/
public class ControlTest16 {

    public static void main(String[] args) {
        int[][] a = new int[][] {{1,2,3,},{4,5,6},{7,8,9},{10,11,12}};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                //第1行和第5行所有元素求和
                if(i == 0||i==a.length-1){
                    sum += a[i][j];
                }else {
                    //其他行 只要第1列和第5列求和
                    if(j==0||j==a[i].length-1){
                        sum += a[i][j];

                    }
                }

            }
        }
        System.out.println("sum="+sum);
    }
}
