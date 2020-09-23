package com.hx.grzl.class3;

/**
 * 习题15：嵌套列表的正、反对角线之和
 *
 * l = [
 *      [11,2,3],
 *      [4,5,6],
 *      [7,8,9]
 * ]
 **/
public class ControlTest15 {

    private static void matrSum(int[][] a){
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[i].length;j++){
                if(i==j) sum1 += a[i][j];
                if(j==a.length-i-1) sum2 += a[i][j];
            }
        System.out.println("矩阵对角线之和分别是："+sum1+"和"+sum2);
    }

    public static void main(String[] args) {
        int[][] a = new int[][] {{11,2,3,},{4,5,6},{7,8,9}};
        matrSum(a);
    }
}
