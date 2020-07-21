package com.hx.grzl.class2;

/**
 * 课后习题12、交换两个变量的值
 **/
public class HomeWorkNo12 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("x="+x+", y="+y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x="+x+", y="+y);

    }
}
