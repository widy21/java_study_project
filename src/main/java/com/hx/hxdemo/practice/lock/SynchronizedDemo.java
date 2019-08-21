package com.hx.hxdemo.practice.lock;

import java.util.concurrent.TimeUnit;

public class SynchronizedDemo {

    public static void c(){
        synchronized (SynchronizedDemo.class){
            try {
                TimeUnit.MINUTES.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new Thread(SynchronizedDemo::c).start();
        }
    }
}
