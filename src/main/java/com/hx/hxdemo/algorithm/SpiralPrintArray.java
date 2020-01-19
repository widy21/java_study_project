package com.hx.hxdemo.algorithm;

/**
 * 螺旋展示二维数组。
 */
public class SpiralPrintArray {

    /**
     * 螺旋展示
     * 
     * @param n 任意数，负数默认为1.
     * @return
     */
    private static int[][] luoxuan(int n) {
        if (n <= 0) {
            n = 1;
        }
        int a[][] = new int[n][n];
        int top = 0, bottom = n - 1;// 上下
        int left = 0, right = n - 1;// 左右
        int i = top, j = left;
        int sum = 1;
        while (true) {
            // 上
            while (j != right + 1) {
                a[i][j] = sum;
                sum++;
                j++;
            }
            j--;
            if ((sum - 1) == (n * n)) {
                break;// 退出条件
            }
            top++;
            i = top;

            // 右
            while (i != bottom + 1) {
                a[i][j] = sum;
                sum++;
                i++;
            }
            i--;

            if ((sum - 1) == (n * n)) {
                break;
            }
            right--;
            j = right;
            // 下
            while (j != left - 1) {
                a[i][j] = sum;
                sum++;
                j--;
            }
            j++;
            if ((sum - 1) == (n * n)) {
                break;
            }
            bottom--;
            i = bottom;
            // 左
            while (i != top - 1) {
                a[i][j] = sum;
                sum++;
                i--;
            }
            i++;
            if ((sum - 1) == (n * n)) {
                break;
            }
            left++;
            j = left;
        }
        System.out.println("n=" + n + ",i=" + i + ",j=" + j + ",sum=" + sum);
        return a;
    }

    public static void main(String[] args) {
        int n = 5;
        int a[][] = luoxuan(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + a[i][j] + " ");
            }
            System.out.println("\n");
        }

    }
}