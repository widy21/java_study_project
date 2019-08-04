package com.hx.hxdemo.algorithm;

import com.google.common.collect.Lists;

import java.util.*;

public class LargeNumAdd {

    public static String largeNumAdd(String num1, String num2) throws Exception {

//        String num1 = "1234";
//        String num2 = "127";
        if (!num1.matches("\\d+") || !num2.matches("\\d+")) {
            throw new Exception("字符串中包含非数字");
        }
        char[] num1Array = num1.toCharArray();
        char[] num2Array = num2.toCharArray();
        int len = num1Array.length > num2Array.length ? num1Array.length : num2Array.length;
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
                num1Array[i] = '0';
            }
        }
        //        String num1 = "1234";
        //        String num2 = "1270";
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
            l.add(resultArray[i] + "");
        }
        Collections.reverse(l);
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
