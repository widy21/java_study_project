package com.hx.hxdemo.algorithm;

import java.util.concurrent.locks.LockSupport;

/**
 * 交替打印数组内容。
 */
public class PrintArray {

    static String s1 = "12345";
    static String s2 = "abcde";

    static Thread t1 = null,t2 = null;
    static char[] a1 = s1.toCharArray();
    static char[] a2 = s2.toCharArray();

    public static void main(String[] args) {

        t1 = new Thread(()->{
            for (char c : a1) {
                System.out.println(c);
                LockSupport.unpark(t2);
                LockSupport.park();
            }
        },"t1");

        t2 = new Thread(()->{
            for (char c : a2) {
                LockSupport.park();
                System.out.println(c);
                LockSupport.unpark(t1);
            }
        },"t2");

        t1.start();
        t2.start();
    }

}
