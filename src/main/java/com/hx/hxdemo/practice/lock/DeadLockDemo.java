package com.hx.hxdemo.practice.lock;

import java.util.concurrent.TimeUnit;

class DLSourceClass {
    private String l1 = "l1";
    private String l2 = "l2";

    public DLSourceClass(String l1, String l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    public void Foo1() throws Exception {
        synchronized (l1) {
            TimeUnit.SECONDS.sleep(1);
            System.out.println(Thread.currentThread().getName() + " get l1 lock.");
            synchronized (l2) {
                System.out.println(Thread.currentThread().getName() + " get l2 lock.");
            }
        }
    }


    public void Foo2() throws Exception {
        synchronized (l2) {
            TimeUnit.SECONDS.sleep(1);
            System.out.println(Thread.currentThread().getName() + " get l2 lock.");
            synchronized (l1) {
                System.out.println(Thread.currentThread().getName() + " get l1 lock.");
            }
        }
    }
}

public class DeadLockDemo {

    public static void main(String[] args) {
        String l1 = "l1";
        String l2 = "l2";
        DLSourceClass sourceClass = new DLSourceClass(l1, l2);
        new Thread(() -> {
            try {
                sourceClass.Foo1();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        },"t1").start();

        new Thread(() -> {
            try {
                sourceClass.Foo2();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        },"t2").start();
    }
}