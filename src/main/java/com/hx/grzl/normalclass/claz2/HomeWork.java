package com.hx.grzl.normalclass.claz2;

/**
 * 作业：
 * 1、定义两个数组，通过嵌套循环
 * 求两个数组中各元素相乘结果、
 * 求两个数组中偶数相乘、
 * 奇数相除的结果。
 */
public class HomeWork {
    public static void main(String[] args) {
        //1. 定义两个数据
        int[] arr1 = {1, 2, 3};
        int[] arr2 = new int[]{4, 5, 6};
        //2. 求两个数组中各元素相乘结果
        allMulti(arr1, arr2);

        System.out.println("***********求两个数组中偶数相乘***********");

        //3. 求两个数组中偶数相乘
        muti(arr1, arr2);

        System.out.println("***********奇数相除的结果***********");

        //4. 奇数相除的结果
        devide(arr1, arr2);

    }

    private static void devide(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            int arr1Element = arr1[i];
            // 如果第一个数组中的元素是偶数，就跳过
            if (arr1Element % 2 == 0) {
                continue;
            }
            for (int j = 0; j < arr2.length; j++) {
                int arr2Element = arr2[j];
                // 如果第二个数组中的元素是偶数，就跳过
                if (arr2Element % 2 == 0) {
                    continue;
                }
                System.out.println(arr1Element + "/" + arr2Element + "=" + arr1Element / arr2Element);
            }
        }
    }

    private static void muti(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            int arr1Element = arr1[i];
            // 如果第一个数组中的元素是偶数
            if (arr1Element % 2 == 0) {
                for (int j = 0; j < arr2.length; j++) {
                    int arr2Element = arr2[j];
                    // 如果第二个数组中的元素是偶数
                    if (arr2Element % 2 == 0) {
                        System.out.println(arr1Element + "*" + arr2Element + "=" + arr1Element * arr2Element);
                    }
                }
            }
        }
    }

    private static void allMulti(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            int arr1Element = arr1[i];
            for (int j = 0; j < arr2.length; j++) {
                int arr2Element = arr2[j];
                System.out.println(arr1Element + "*" + arr2Element + "=" + arr1Element * arr2Element);
            }
        }
    }
}
