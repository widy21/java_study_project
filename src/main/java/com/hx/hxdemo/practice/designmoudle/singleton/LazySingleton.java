package com.hx.hxdemo.practice.designmoudle.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 单例模式，懒汉式，线程不安全
public class LazySingleton {
    private static LazySingleton singleton;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (singleton == null)
            //多个线程可以同时进入，可能被实例化多次。
            return new LazySingleton();
        return singleton;
    }


    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            es.execute(()->{
                HungarySingleton s = HungarySingleton.getInstance();
                System.out.println(String.format("{%s} --> {%s}",Thread.currentThread(),s ));
            });
        }
        es.shutdown();

    }
}