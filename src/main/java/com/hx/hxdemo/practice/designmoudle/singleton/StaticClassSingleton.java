package com.hx.hxdemo.practice.designmoudle.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 单例模式，饿汉式，线程安全
public class StaticClassSingleton {

    // 通过内部类实现线程安全。
    public static class InnerClass {
        private static final StaticClassSingleton singleton = new StaticClassSingleton();
    }

    private StaticClassSingleton() {
    }

    public static StaticClassSingleton getInstance() {
        return InnerClass.singleton;
    }


    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            es.execute(() -> {
                StaticClassSingleton s = StaticClassSingleton.getInstance();
                System.out.println(String.format("{%s} --> {%s}", Thread.currentThread(), s));
            });
        }
        es.shutdown();
    }
}