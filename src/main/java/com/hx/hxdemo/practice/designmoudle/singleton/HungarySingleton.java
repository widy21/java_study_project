package com.hx.hxdemo.practice.designmoudle.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 单例模式，饿汉式，线程安全
public class HungarySingleton {
    private static HungarySingleton singleton = new HungarySingleton();

    private HungarySingleton() {
    }

    public static HungarySingleton getInstance() {
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