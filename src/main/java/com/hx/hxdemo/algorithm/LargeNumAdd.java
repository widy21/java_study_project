package com.hx.hxdemo.algorithm;

import com.google.common.collect.Lists;

import java.util.*;

/**
 * 大数加法
 */
public class LargeNumAdd {

    public static String largeNumAdd(String num1, String num2) throws Exception {

//        String num1 = "1234";
//        String num2 = "127";

        // 异常情况判断
        if (!num1.matches("\\d+") || !num2.matches("\\d+")) {
            throw new Exception("字符串中包含非数字");
        }

        // 转换成char数组
        char[] num1Array = num1.toCharArray();
        char[] num2Array = num2.toCharArray();

        // 确定循环length
        int len = num1Array.length > num2Array.length ? num1Array.length : num2Array.length;

        // 把长度短的数组用'0'补齐
        if (num1Array.length > num2Array.length) {
            for (int i = num2Array.length; i < len; i++) {
                char[] temp = new char[len];
                copyArray(num2Array,temp);
                num2Array = temp;
                num2Array[i] = '0';
            }
        }
        if (num1Array.length < num2Array.length) {
            for (int i = num1Array.length; i < len; i++) {
                //这里也需要扩容copyArray
                num1Array[i] = '0';
            }
        }
        //        String num1 = "1234";
        //        String num2 = "1270";

        // 开始计算
        int[] resultArray = new int[len];
        List l = Lists.newArrayList();
        //从个位开始运算
        for (int i = len-1; i >=0; i--) {
            resultArray[i] += num1Array[i]-'0' + (num2Array[i]-'0');
            if (resultArray[i] >= 10) {
                int sum = resultArray[i];
                resultArray[i] = sum % 10;
                resultArray[i - 1] = sum / 10;
            }
            // 计算结果添加到list
            l.add(resultArray[i] + "");
        }
        // 集合反转
        Collections.reverse(l);
        // join元素
        return String.join("", l);


    }

    private static void copyArray(char[] num2Array, char[] temp) {
        for(int i=0;i<num2Array.length;i++){
            temp[i]=num2Array[i];
        }
        return;
    }

    private static int getArrayNum(char[] c, int i) {
        if (c.length <= i) {
            return 0;
        } else {
            return c[i] - '0';
        }

    }

    public static void main(String[] args) throws Exception {
        String num1 = "123434564564561231234587897312312";
        String num2 = "12764564564561231234587897312312";

//        System.out.println(num1.matches("\\d"));
//        System.out.println(new StringBuilder(num1).reverse().toString());
//        String numAdd = LargeNumAdd.largeNumAdd(new StringBuilder(num1).reverse().toString(), new StringBuilder(num2).reverse().toString());
        String numAdd = LargeNumAdd.largeNumAdd(num1, num2);
        System.out.println(numAdd);
    }
}
