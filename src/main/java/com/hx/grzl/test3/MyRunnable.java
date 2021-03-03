package com.hx.grzl.test3;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2021-01-27 18:53
 **/
public class MyRunnable implements Runnable {

    //定义退出标志，true会一直执行，false会退出循环
    //使用 volatile 目的是保证可见性，一处修改了标志，处处都要去主存读取新的值，而不是使用缓存
    public boolean flag = true;

    public void run() {
        System.out.println("第" + Thread.currentThread().getName() + "个线程创建");

        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //退出标志生效位置
        while (flag) {
        }
        System.out.println("第" + Thread.currentThread().getName() + "个线程终止");
    }
}
