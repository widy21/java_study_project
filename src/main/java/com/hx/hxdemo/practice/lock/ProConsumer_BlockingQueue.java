package com.hx.hxdemo.practice.lock;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2020-01-09 11:43
 **/

class SourceBqClass{
    private BlockingQueue<String> bq = null;
    private boolean FLAG = true;
    private AtomicInteger num  = new AtomicInteger();

    public SourceBqClass(BlockingQueue bq){
        this.bq = bq;
    }

    public void MyPro() throws InterruptedException {
        String data  = null;
        while(FLAG){
            if(bq.isEmpty()){
               data = num.incrementAndGet()+"";
                boolean offer = bq.offer(data,2L, TimeUnit.SECONDS);
                if(!offer){
                    System.out.println(Thread.currentThread().getName()+"\t生产失败，当前num值="+num.get());
                }else {
                    System.out.println(Thread.currentThread().getName()+"\t生产完成，当前num值="+num.get());
                }
                TimeUnit.SECONDS.sleep(1);
            }
        }
    }

    public void MyConsume() throws InterruptedException {
        String data  = null;
        while(FLAG){
            if(!bq.isEmpty()){
                data = bq.poll(2L,TimeUnit.SECONDS);
                if(null == data || data.equals("")){
                    System.out.println(Thread.currentThread().getName()+"\t消费失败，当前num值="+data);
                    FLAG = false;
                    return;
                }else {
                    System.out.println(Thread.currentThread().getName()+"\t消费完成，当前num值="+data);
                }
                TimeUnit.SECONDS.sleep(1);
            }
        }
    }

    public void stop(){
        this.FLAG = false;
        System.out.println("任务终止。。。");
    }

}

public class ProConsumer_BlockingQueue {
    public static void main(String[] args) {
        SourceBqClass sc = new SourceBqClass(new ArrayBlockingQueue<String>(10));

        new Thread(()->{
            try {
                sc.MyPro();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"AA").start();

        new Thread(()->{
            try {
                sc.MyConsume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"BB").start();


        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        sc.stop();
    }
}
