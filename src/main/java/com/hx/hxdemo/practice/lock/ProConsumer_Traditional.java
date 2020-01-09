package com.hx.hxdemo.practice.lock;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: hx-demo
 * @description: 传统生产者消费者模型。
 * @author: huaxiao
 * @create: 2020-01-09 10:32
 **/

//资源类
class SourceClass{
//    private volatile AtomicInteger num = new AtomicInteger();
    private volatile int num;
    private Lock lock = new ReentrantLock();
    private Condition con = lock.newCondition();

    public void MyPro(){
        try{
            lock.lock();
            //1. 判断
            while(num != 0){
                con.await();
            }

            //2. 干活
            num++;
            System.out.println(Thread.currentThread().getName()+"\t生产完成，当前num值="+num);

            //3. 通知
            con.signalAll();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void MyConsume(){
        try{
            lock.lock();
            while(num != 1){
                con.await();
            }
            num--;
            System.out.println(Thread.currentThread().getName()+"\t消费完成，当前num值="+num);
            con.signalAll();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}

public class ProConsumer_Traditional {
    public static void main(String[] args) {
        SourceClass sc = new SourceClass();

            new Thread(()->{
                for (int i = 0; i < 10; i++) {
                    sc.MyPro();
                }
            },"AA").start();

            new Thread(()->{
                for (int i = 0; i < 10; i++) {
                    sc.MyConsume();
                }
            },"BB").start();

    }

}
