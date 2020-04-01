package com.hx.grzl;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: hx-demo
 * @description: 习题5：输出奇数字母和偶数字母到两个列表中
 * @author: huaxiao
 * @create: 2020-04-01 21:57
 **/
public class TestNo5 {


    /**
     * 方式3
     */
    private static void foo1() {
        // 奇数
        List<String> oddList = new ArrayList<>();
        // 偶数
        List<String> evenList = new ArrayList<>();
        for (int i = 97; i < 123; i++) {
            if (i % 2 == 0) {
                evenList.add(String.valueOf((char)(i)));
            } else {
                oddList.add(String.valueOf((char)(i)));
            }
        }
        System.out.println(String.join("", oddList));
        System.out.println(String.join("", evenList));
    }


    public static void main(String[] args) {
        foo1();
    }
}
