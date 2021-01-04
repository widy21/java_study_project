package com.hx.grzl.normalclass.claz2;

import java.util.Scanner;

/**
 * 二维数组：
 *
 * 1. 理解二维数组
 * 1）对于二维数组，可以看成是一维数组又作为另一个一维数组的元素而存在的
 * 2）基于对于二维数组的理解，可以知道，从数组的底层内存结构来看，其实是没有多维数组的。
 *
 * 2. 数组的相关概念
 * 数组名（只有一个变量名）
 * 元素
 * 下标、索引、角标
 * 数组的长度: 元素的个数
 *
 * 3. 数组的特点：
 * 1) 数组是有序的
 * 2) 数组属于引用类型的变量（基本数据类型+引用数据类型）
 * 3) 创建数组对象会在内存中开辟一整块连续的空间
 * 4） 数组的长度一旦确定，就不能更改
 *
 * 4. 数组的分类：
 *  1) 按照维度：一维数组、二维数组（多维数组）
 *  2) 按照数组元素的类型：基本数据类型元素的数组、引用数据类型元素的数组。
 *
 * 5. 二维数组的使用(注意事项)
 * 1) 二维数组的声明和初始化
 * 2) 如何调用数组指定位置的元素
 * 3) 如何获取数组的长度值
 * 4) 数组的遍历
 * 5) 二维数组元素的默认初始化
 *      ①针对初始化方式1：int[][] arr = new int[4][3];
 *      外层元素的初始化值为： 地址(arr[1])
 *      内层元素的初始化值为：内层一维数组元素的默认值
 *      ②针对初始化方式2：int[][] arr = new int[4][];
 *      外层元素的初始化值为： null
 *      内层元素的初始化值为：NullPointerException
 * 6) 内存结构
 *
 */
public class TestArray1 {
    private static void testBasic1() {
        //1) 二维数组的声明和初始化
//        int[] arr = new int[]{1,2,3};

        //静态初始化
        int[][] arr = new int[][]{{1,2,3},{4,5},{7,8,9}};
        //动态初始化
        String[][] arr1 = new String[3][5];
        int[][] arr3 = new int[3][5];
        //动态初始化
        String[][] arr2 = new String[3][];

        //其他正确的写法
//        int[][] arr3 = {{1,2,3},{4,5},{7,8,9}};
//        int[] arr4[] = {{1,2,3},{4,5},{7,8,9}};

        //error
//        String[][] arr3 = new String[][3];
//        String[3][4] arr3 = new String[][3];
//        int[][] arr3 = new int[3][3]{{1,2,3},{4,5,6},{7,8,9}};


        //2) 如何调用数组指定位置的元素
        System.out.println(arr[0][1]);
        System.out.println(arr1[2][2]);
        System.out.println(arr3[2][2]);
        System.out.println(arr2[1]);

        //3) 如何获取数组的长度值
        System.out.println("arr.length="+arr.length);

        System.out.println("arr[0].length="+arr[0].length);
        System.out.println("arr[0].length="+arr[1].length);
        System.out.println("arr[1].length="+arr[2].length);

        System.out.println("==============数组的遍历==============");
        //4) 数组的遍历 int[][] arr = new int[][]{{1,2,3},{4,5},{7,8,9}};
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        testBasic1();

//        5) 数组元素的默认初始化
//        System.out.println("================int init===============");
//        int[][] arr = new int[4][3];
//        System.out.println(arr);
//        System.out.println(arr[0]);
//        System.out.println(arr[0][0]);
//
//        System.out.println("================float init===============");
//        float[][] arr1 = new float[4][3];
//        System.out.println(arr1[0]);
//        System.out.println(arr1[0][0]);
//
//        System.out.println("================String init===============");
//        String[][] arr2 = new String[4][3];
//        System.out.println(arr2[0]);
//        System.out.println(arr2[0][0]);
//
//        System.out.println("================double init===============");
        // todo -- unkown Exception...
//        double[][] arr3 = new double[4][];
//        System.out.println(arr3[0]);
//        System.out.println(arr3[0][0]);
////        arr3 = null;
//
//        double[][] arr4 = new double[4][];
//        System.out.println(arr4[1]);
//        System.out.println(arr4[1][0]);

        System.out.println("input。。。");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println("i="+i);

    }
}
