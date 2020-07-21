package com.hx.grzl.class1;

/**
 * 习题16、求一个列表中的最大值
 * Created by huaxiao on 2020/4/7.
 */
public class TestNo16 {

    private int max(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(new TestNo16().max(arr));
    }
}
