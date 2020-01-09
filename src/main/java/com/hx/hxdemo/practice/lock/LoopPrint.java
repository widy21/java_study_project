package com.hx.hxdemo.practice.lock;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: hx-demo
 * @description:
 *   3个线程交替打印： AA打印5次，BB打印10次，CC打印15次，如此10轮。
 * @author: huaxiao
 * @create: 2020-01-09 13:57
 **/
class LPSourceClass{
    private Lock lock = new ReentrantLock();
    private Condition con1 = lock.newCondition();
    private Condition con2 = lock.newCondition();
    private Condition con3 = lock.newCondition();
    private int num = 1;

    public void print5(){
        try {
            lock.lock();
            while(num !=1){
                con1.await();
            }
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName()+"\tprint "+i);
            }
            System.out.println();
            System.out.println();
            num = 2;
            con2.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void print10(){
        try {
            lock.lock();
            while(num !=2){
                con2.await();
            }
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName()+"\tprint "+i);
            }
            System.out.println();
            System.out.println();
            num = 3;
            con3.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void print15(){
        try {
            lock.lock();
            while(num !=3){
                con3.await();
            }
            for (int i = 1; i <= 15; i++) {
                System.out.println(Thread.currentThread().getName()+"\tprint "+i);
            }
            System.out.println();
            System.out.println();
            num = 1;
            con1.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}


public class LoopPrint {
    public static void main(String[] args) {
        LPSourceClass sc = new LPSourceClass();
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                sc.print5();
            },"AA").start();
            new Thread(()->{
                sc.print10();
            },"BB").start();
            new Thread(()->{
                sc.print15();
            },"CC").start();

        }
    }
}
