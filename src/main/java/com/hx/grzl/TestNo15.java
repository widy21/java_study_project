package com.hx.grzl;

import java.util.Arrays;

/**
 * 习题15、三个数排序
 * Created by huaxiao on 2020/4/6.
 */
public class TestNo15 {

    public void sortNum(int[] originArr) {
        for (int i = 0; i < originArr.length-1; i++) {
            if (originArr[i] > originArr[i + 1]) {
                int tmp = originArr[i];
                originArr[i] = originArr[i + 1];
                originArr[i + 1] = tmp;
            }
        }

        System.out.println(Arrays.toString(originArr));
    }

    public static void main(String[] args) {
        int[] arr = {9, 2, 7};
        new TestNo15().sortNum(arr);
    }
}
