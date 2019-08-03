package com.hx.hxdemo.algorithm;

import com.google.common.collect.Lists;

import java.util.*;

public class LargeNumAdd {

    public static String largeNumAdd(String num1, String num2) throws Exception {
        if (!num1.matches("\\d+") || !num2.matches("\\d+")) {
            throw new Exception("字符串中包含非数字");
        }
        char[] num1Array = num1.toCharArray();
        char[] num2Array = num2.toCharArray();
        int len = num1Array.length > num2Array.length ? num1Array.length : num2Array.length;
        int[] resultArray = new int[len+1];
        List l = Lists.newArrayList();
        for (int i = 0; i < len; i++) {
            resultArray[i] += getArrayNum(num1Array,i) + getArrayNum(num2Array,i);
            if (resultArray[i] > 10) {
                int sum = resultArray[i];
                resultArray[i] =  sum % 10;
                resultArray[i + 1] = sum / 10;
            }
            l.add(resultArray[i]+"");
        }
        Collections.reverse(l);
        return String.join("", l);


    }

    private static int getArrayNum(char[] c, int i) {
        if(c.length<=i){
            return 0;
        }else {
            return c[i] - '0';
        }

    }

    public static void main(String[] args) throws Exception{
        String num1 = "1234";
        String num2 = "123";

//        System.out.println(num1.matches("\\d"));
//        System.out.println(new StringBuilder(num1).reverse().toString());
        System.out.println(LargeNumAdd.largeNumAdd(new StringBuilder(num1).reverse().toString(),new StringBuilder(num2).reverse().toString()));
    }
}
