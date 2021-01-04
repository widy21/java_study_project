package com.hx.grzl.normalclass.claz2;

/**
 * 数组概述：
 *
 * 1. 数组是多个相同类型数据，按照一定顺序排列的组合，实现对这些数据的统一管理
 * 数组中的元素可以是任何数据类型，包括基本数据类型和引用数据类型
 * 数组属引用类型，数组型数据是对象(object)，数组中的每个元素相当于该对象的成员变量
 *
 * 2. 数组的相关概念
 * 数组名（只有一个变量名）
 * 元素
 * 下标、索引、角标
 * 数组的长度: 元素的个数
 *
 * 3. 数组的特点：
 * 1) 数组是有序的 {1,3,5}=> 1 3 5
 * 2) 数组属于引用类型的变量（基本数据类型+引用数据类型）
 * 3) 创建数组对象会在内存中开辟一整块连续的空间
 * 4） 数组的长度一旦确定，就不能更改
 *
 * 4. 数组的分类：
 *  1) 按照维度：一维数组、二维数组（多维数组）
 *  2) 按照数组元素的类型：基本数据类型元素的数组、引用数据类型元素的数组。
 *
 * 5. 一维数组的使用(注意事项)
 * 1) 一维数组的声明和初始化
 * 2) 如何调用数组指定位置的元素
 * 3) 如何获取数组的长度值
 * 4) 数组的遍历
 * 5) 数组元素的默认初始化
 * 6) 内存结构
 *
 */
public class TestArray {



    private static void testArrayInit() {
        int[] arr = new int[3];
        System.out.println("int array init value:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("short array init value:");
        short[] shortArr = new short[3];
        for(int i=0;i<shortArr.length;i++){
            System.out.println(shortArr[i]);
        }

        System.out.println("float array init value:");
        float[] floatArr = new float[3];
        for(int i=0;i<floatArr.length;i++){
            System.out.println(floatArr[i]);
        }

        System.out.println("char array init value:");
        char[] charArr = new char[3];
        for(int i=0;i<charArr.length;i++){
            System.out.println("==="+charArr[i]+"===");
        }

        if(charArr[0] == 0){
            System.out.println("char init is 0...");
        }

        System.out.println("String array init value:");
        String[] stringArr = new String[3];
        for(int i=0;i<stringArr.length;i++){
            System.out.println(stringArr[i]);
        }
    }

    private static void test1() {
        // 1) 一维数组的声明和初始化
//        int a = 1;
//        int num;
//        num = 2;

        int[] arr1;
        //1. 静态初始化： 数组的初始化和数组元素的赋值操作同时完成
        arr1 = new int[]{1,3,4,7,8,};

        //2. 动态初始化： 数组的初始化和数组元素的赋值操作分开完成
        String[] strArr = new String[5];

        //error:
//        String strArr = new String[5];
//        int[] arr1 = new int[];
//        int[] arr11 = new int[3]{1,2,3};

        strArr[0] = "stu1";
        strArr[1] = "stu2";
        strArr[2] = "stu3";
        strArr[3] = "stu4";
        strArr[4] = "stu5";
//        strArr[5] = "stu6";
        System.out.println(strArr[2]);

//        3) 如何获取数组的长度值
        System.out.println("strArr.length="+strArr.length);
        System.out.println("arr1.length="+arr1.length);

        System.out.println("数组的遍历:");
//        4) 数组的遍历
        for(int i=0; i<strArr.length; i++){
            System.out.println(strArr[i]);
        }
    }

    public static void main(String[] args) {
        test1();
//        5) 数组元素的默认初始化
        testArrayInit();
    }
}
