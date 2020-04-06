package com.hx.grzl;

import java.util.Arrays;
import java.util.Collections;

/**
 * 习题10、倒序取出每个单词的第一个字母。
 * Created by huaxiao on 2020/4/6.
 */
public class TestNo10 {

    private static void foo1(String s) {
        String[] arr = s.split(" ");
        System.out.println(String.join(" ",arr));
        Collections.reverse(Arrays.asList(arr));
        System.out.println(String.join(" ",arr));
        for (String s1 : arr) {
            System.out.print(s1.charAt(0));
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        String s = "I am a good boy ";
        foo1(s);
//        foo2(s);
    }

    private static void foo2(String s) {
        String[] arr = s.split(" ");
        System.out.println(String.join(" ",arr));
        for (int i = arr.length-1; i > -1 ; i--) {
            System.out.print(arr[i].charAt(0));
            System.out.print(" ");

        }
    }
}
