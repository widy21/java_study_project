package com.hx.grzl.class2;

/**
 * 课后习题11、判断一个数n能否同时被3和5整除
 **/
public class HomeWorkNo11 {
    public static void main(String[] args) {
        int n = 12;
        if (n % 3 == 0 && n % 5 == 0) {

            System.out.println("可以同时被3和5整除");
        } else {

            System.out.println("不可以同时被3和5整除");
        }


    }
}
