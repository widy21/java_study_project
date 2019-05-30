package com.hx.hxdemo.practice.staticblock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class StaticBlock {

    public StaticBlock(){
        System.out.println("new over...");
    }

    static {
        System.out.println("execute static block...");
    }
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            executorService.execute(()->{
                try {
                    StaticBlock staticBlock = new StaticBlock();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }
        executorService.shutdown();
    }
}
