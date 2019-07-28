package com.hx.hxdemo.algorithm;

/*
求一个数组中，不重复的数字
 */
public class NoRepeatNum {

    public static void main(String[] args) {
        int[] numArr = {2, 3, 4, 5, 2, 3, 4,6,5};
        String[] sa = {"a","bb"};
        int result = 0;
        for (int i = 0; i < numArr.length; i++) {
            /*
             a^a=0
             a^0=a
             a^(b^c) = (a^b)^c
              */

            result ^= numArr[i];
        }
        System.out.println(String.format("the result is %s.", result));

//        System.out.println(1^1);
//        System.out.println(1^2);
//        System.out.println(1^0);
    }
}
