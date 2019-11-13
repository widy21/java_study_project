package com.hx.hxdemo.practice.aqs;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class MyAqsQueue {
    private LinkedList<Object> list = new LinkedList<Object>();
    private int maxSize;
    private int minSize = 0;
    private AtomicInteger count = new AtomicInteger(0);
    private final Object lock = new Object();

    public MyAqsQueue(int size) {
        this.maxSize = size;
    }

    public int size() {
        return count.get();
    }

    public void put(Object obj) {
        synchronized (lock) {
            while (size() == maxSize) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            list.add(obj);
            System.out.println(String.format("put %s success.", obj));
            count.incrementAndGet();
            lock.notify();
        }
    }

    public Object get() {
        synchronized (lock) {
            while (size() == minSize) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Object obj = list.removeFirst();
            System.out.println(String.format("get %s success.", obj));
            count.decrementAndGet();
            lock.notify();
            return obj;
        }
    }

    public static void main(String[] args) {
        MyAqsQueue mq = new MyAqsQueue(3);
        ExecutorService pool = Executors.newFixedThreadPool(3);
        pool.execute(new Runnable() {
            @Override
            public void run() {
                mq.put("a");
                mq.put("b");
                mq.put("c");
                mq.put("d");
                mq.put("e");
            }
        });
        try {
            Thread.sleep(1000);
            System.out.println("当前容器的大小：" + mq.size());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        pool.execute(new Runnable() {
            @Override
            public void run() {
                mq.get();
                mq.get();
                mq.get();
                mq.get();
                mq.get();
                mq.get();
            }
        });

        pool.shutdownNow();

//        Thread t1 = new Thread(new Runnable() {
//
//            @Override
//            public void run() {
//                m.put("a");
//                m.put("b");
//                m.put("c");
//                m.put("d");
//                m.put("e");
//                m.put("f");
//
//            }
//        });
//        t1.start();
//
//        try {
//            Thread.sleep(1000);
//            System.out.println("当前容器的大小：" + m.size());
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        Thread t2 = new Thread(new Runnable() {
//
//            @Override
//            public void run() {
//                Object o = m.get();
//                System.out.println("取出的元素为：" + o);
//            }
//        });
//        t2.start();
//        try {
//            Thread.sleep(10);
//            System.out.println(m.size());
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
    }


}
