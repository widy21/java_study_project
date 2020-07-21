package com.hx.grzl.class1;

import java.util.Random;

/**
 * Created by huaxiao on 2020/4/7.
 */
public class TestNo18 {

    private static void foo1() {
        String pwd = "";
        int max= 90;
        int min = 65;
        for (int i = 0; i < 9; i++) {
            int num = new Random().nextInt(max-min+1)+min;
//            int num = min + (int)(Math.random() * ((max - min) + 1));
            String value = String.valueOf((char) (num));
            pwd += value;
        }
        System.out.println(pwd);
    }

    public static void main(String[] args) {
foo1();
    }
}
