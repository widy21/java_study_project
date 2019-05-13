package com.hx.hxdemo.practice.designmoudle.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 单例模式，懒汉式，线程安全
public class SyncSingleton {
    private static SyncSingleton singleton;

    private SyncSingleton() {
    }

    // 通过同步锁的方式实现线程安全
    public static synchronized SyncSingleton getInstance() {
        if(singleton == null)
            return new SyncSingleton();
        return singleton;
    }


    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            es.execute(()->{
                SyncSingleton s = SyncSingleton.getInstance();
                System.out.println(String.format("{%s} --> {%s}",Thread.currentThread(),s ));
            });
        }
        es.shutdown();
    }
}