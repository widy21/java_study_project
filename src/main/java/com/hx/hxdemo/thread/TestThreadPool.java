package com.hx.hxdemo.thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2020-06-16 16:11
 **/
public class TestThreadPool {
    private final static ThreadPoolExecutor pools = new ThreadPoolExecutor(10, 10,
            60L, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<>(150), new ThreadPoolExecutor.CallerRunsPolicy());

    static {
        pools.allowCoreThreadTimeOut(true);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            pools.submit(()->{
                System.out.println(Thread.currentThread().getName());
            });

        }


    }
}
