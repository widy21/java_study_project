package com.hx.hxdemo.practice.lock;

import java.util.ArrayList;
import java.util.List;
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
class SourceClass_BlockingQueue{
//    private volatile int num;
    private Lock lock = new ReentrantLock();
    private Condition con = lock.newCondition();
//    private int[] array = new int[]{};
    private volatile List<Integer> list = new ArrayList<>();
    private int queueSize = 0;
    public SourceClass_BlockingQueue(int queueSize){
        this.queueSize = queueSize;
//        array = new int[queueSize];
    }

    public void MyPro(int e){
        try{
            lock.lock();
            //1. 判断
            while(list.size() >= queueSize){
                con.await();
            }

            //2. 干活
//            int len = array.length;
//            array[len-1] = e;
            list.add(e);

            System.out.println(Thread.currentThread().getName()+"\t生产完成，生产值 = "+e);

            //3. 通知
            con.signalAll();

        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void MyConsume(){
        try{
            lock.lock();
            while(list.size() == 0){
                con.await();
            }

//            for (int i = 0; i < array.length - 1; i++) {
//            int len = array.length;
            int e = list.remove(0);
            System.out.println(Thread.currentThread().getName()+"\t消费完成，消费值="+e);
//            }

            con.signalAll();

        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}

public class ProConsumer_Traditional_BlockingQueue {
    public static void main(String[] args) {
        SourceClass_BlockingQueue sc = new SourceClass_BlockingQueue(2);

        // 生产多，消费少，消费就会被阻塞。
        // 生产数据个数超过容量，就会等待消费完成，再次进行生产。

            new Thread(()->{
                for (int i = 0; i < 5; i++) {
                    sc.MyPro(i);
                }
            },"AA").start();

            new Thread(()->{
                for (int i = 0; i < 5; i++) {
                    sc.MyConsume();
                }
            },"BB").start();

    }

}
