package com.hx.hxdemo.practice.lock;

import java.util.concurrent.*;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2020-01-13 20:24
 **/
public class ThreadPoolExecutorDemo {

    public static void main(String[] args) throws InterruptedException {
        Executors.newFixedThreadPool(3);

        ExecutorService pool = new ThreadPoolExecutor(
                2,
                5,
                1L,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<Runnable>(3),
                Executors.defaultThreadFactory(),
//java.util.concurrent.RejectedExecutionException
// -- 理论上超过8个就会报错，实际测试13个经常会报错
//                new ThreadPoolExecutor.AbortPolicy()
//                如果线程池中线程处理不过来，就交给调用线程main去执行。
//                new ThreadPoolExecutor.CallerRunsPolicy()
//                丢弃保存时间最长的任务。
//                new ThreadPoolExecutor.DiscardOldestPolicy()
//                丢弃多余的任务。
                new ThreadPoolExecutor.DiscardPolicy()
        );

        try {
            for (int i = 0; i < 20; i++) {
                pool.execute(() -> {
                    System.out.println(Thread.currentThread().getName() + "\t办理业务");
                });
            }
            System.out.println(Thread.currentThread().getName()+"\t办理业务");
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            pool.shutdown();
        }


//        TimeUnit.SECONDS.sleep(1);


    }
}
