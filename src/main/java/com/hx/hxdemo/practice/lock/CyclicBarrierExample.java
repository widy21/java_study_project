package com.hx.hxdemo.practice.lock;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierExample {

    final static int totalThread = 10;
    static CyclicBarrier cyclicBarrier = new CyclicBarrier(totalThread);

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < totalThread; i++) {
            executorService.execute(() -> {

                try {
                    test(Thread.currentThread().getName());
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }

            });
        }
        executorService.shutdown();
    }

    private static void test(String name) throws BrokenBarrierException, InterruptedException {
        System.out.println("before..");
        System.out.println(String.format("current thread name = {%s}", name));
        cyclicBarrier.await();
        System.out.println("after..");
    }
}

