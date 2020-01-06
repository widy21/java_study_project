package com.hx.hxdemo.practice.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @program: hx-demo
 * @description: cas自旋锁实现。
 * @author: huaxiao
 * @create: 2020-01-06 19:59
 **/
public class MyCasLock {

    AtomicReference<Thread> ar = new AtomicReference<>();

    public void myLock(){
        Thread cur = Thread.currentThread();
        while(!ar.compareAndSet(null, cur)){
        }
        System.out.println(cur.getName()+"\tget the lock");
    }

    public void myUnlock(){
        Thread cur = Thread.currentThread();
        boolean flag = ar.compareAndSet(cur, null);
        if(flag){
            System.out.println(cur.getName()+"\t release the lock");
        }
    }

    public static void main(String[] args){

        MyCasLock myCasLock = new MyCasLock();

        new Thread(()->{
            myCasLock.myLock();

            // 5秒后释放
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.println("t1 process over...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            myCasLock.myUnlock();
        }, "t1").start();


        // 保证 t1 先执行
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            // 5秒后得到锁
            myCasLock.myLock();

            // 得到锁后休眠1秒
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 1秒后释放
            myCasLock.myUnlock();
        }, "t2").start();
    }
}
