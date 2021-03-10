package com.hx.grzl.preclass.claz19.test_volatile;

import java.util.concurrent.TimeUnit;

public class Test {
//    public volatile int a = 0;
    public int a = 0;

    public void increase() {
        a++;
    }

    public static void main(String[] args) throws InterruptedException {
        final Test test = new Test();
        for(int i=0;i<2;i++){
            new Thread(){
                public void run() {
//                    for(int j=0;j<2;j++)
                        test.increase();
                }
            }.start();
        }

//        while(Thread.activeCount()>1)  //保证前面的线程都执行完
//            Thread.yield();

        TimeUnit.SECONDS.sleep(1);
        System.out.println(test.a);
    }
}