package com.hx.grzl.homework;

import java.util.Arrays;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2020-12-23 15:21
 **/
public class Test {

    private static Integer count;

    private static void test(double num) {
        System.out.println("Math.floor(" + num + ")=" + Math.floor(num));//向下取整
        System.out.println("Math.round(" + num + ")=" + Math.round(num));//四舍五入
        System.out.println("Math.ceil(" + num + ")=" + Math.ceil(num));//向上取整
    }


//    public void test(int num){
//        System.out.println("method with primitive argument");
//
//    }

    public void test(Integer num) {
        System.out.println("method with wrapper argument");

    }

    public static void main(String[] args) {
//        System.out.println(Math.abs(-1));
//        System.out.println(Math.sqrt(4));
//        System.out.println(Math.max(2,1));
//        System.out.println(Math.round(1.5));//结果是2
//        System.out.println(Math.round(1.5555));//结果是2
//        System.out.println(Math.round(1.49));//结果是1
//        System.out.println(Math.pow(2,3));//结果是8
//        System.out.println(1/2);//结果是0.47619047619047616
//        System.out.println(Math.random());//产生随机的小数，范围是从0到1之间产生，不包含0和1
//        System.out.println((int)
//                (Math.random()*100));   //强制类型转换，产生随机整数
//        System.out.println(
//                Math.round((Math.random()*100))
//                );   //强制类型转换，产生随机整数

//        float d = 1.5f;
//        System.out.println((int)d);


// 定义原数组，长度为8
       /* int scores[] = new int[] { 100, 81, 68};
        System.out.println("原数组中的内容如下：");


        int[] newScores = scores.clone();
//        int[] newScores = Arrays.copyOf(scores, 5);

        scores[0] = 101;

        // 遍历原数组
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + "\t");
        }

        // 循环遍历目标数组
        System.out.println("\n目标数组内容如下：");
        for (int k = 0; k < newScores.length; k++) {
            System.out.print(newScores[k] + "\t");
        }*/

//        double[] nums = { 1.4, 1.5, 1.6, -1.4, -1.5, -1.6 };
//        for (double num : nums) {
//            test(num);
//        }

        //calling overloaded method
//        Test autoTest = new Test();
//        int value = 3;
//        autoTest.test(value); //no autoboxing
//        Integer iValue = value;
//        autoTest.test(value); //no autoboxing


//        System.out.println(count);
//
//        if( count <= 0){
//            System.out.println("Count is not started yet");
//        }

//        [10,99]
        for (int i = 0; i < 100; i++) {
            int x = (int) (Math.random() * (99 - 10 + 1) + 10);
            System.out.println(x);
        }
    }

}
