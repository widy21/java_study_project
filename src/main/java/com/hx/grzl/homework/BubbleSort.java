package com.hx.grzl.homework;

import java.util.Arrays;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2021-01-11 20:03
 **/
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,0,3,9,8,7};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
            int changeTime = 0;
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    changeTime++;
                }

            }
            if(changeTime == 0){
                break;
            }
        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        System.out.println(Arrays.toString(arr));
    }
}
