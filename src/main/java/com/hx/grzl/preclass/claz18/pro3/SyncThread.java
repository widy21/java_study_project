package com.hx.grzl.preclass.claz18.pro3;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2021-03-03 13:00
 **/
public class SyncThread implements Runnable {
    @Override
    public synchronized void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+": "+i);

        }
        System.out.println("==============");

    }

    public static void main(String[] args) {
        SyncThread syncThread = new SyncThread();
        Thread thread1 = new Thread(syncThread, "t1");
        Thread thread2 = new Thread(syncThread,"t2");
        thread1.start();
        thread2.start();
    }
}
