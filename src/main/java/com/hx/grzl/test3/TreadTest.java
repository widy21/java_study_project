package com.hx.grzl.test3;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2021-01-27 18:54
 **/
public class TreadTest {
    public static void main(String[] arg) throws InterruptedException {
        MyRunnable runnable = new MyRunnable();

        //创建3个线程
        for (int i = 1; i <= 3; i++) {
            Thread thread = new Thread(runnable, i + "");
            thread.start();
        }
        //线程休眠
        Thread.sleep(2000L);
        System.out.println("——————————————————————————");
        //修改退出标志，使线程终止
        runnable.flag = false;
    }
}
