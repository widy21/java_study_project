package com.hx.hxdemo.practice.lock;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CountdownLatchExample {

    private final static ThreadPoolExecutor pools = new ThreadPoolExecutor(10, 10,
            60L, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<>(150), new ThreadPoolExecutor.CallerRunsPolicy());

    static {
        pools.allowCoreThreadTimeOut(true);
    }

    public static void main(String[] args) throws InterruptedException {
        final int totalThread = 10;
        CountDownLatch countDownLatch = new CountDownLatch(totalThread);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < totalThread; i++) {
            int a = i;
            pools.submit(() -> {

//                System.out.println("run.."+Thread.currentThread().getName());
                try {
                    TimeUnit.MILLISECONDS.sleep(10);
                    String name = Thread.currentThread().getName();
                    System.out.println("run.."+ name +", i="+a+", count="+countDownLatch.getCount());
                    if(name.equals("pool-1-thread-7")){
                        throw new Exception("error7");
                    }
//                    countDownLatch.countDown();
                } catch (Exception e) {
                    e.printStackTrace();
                }finally {

                    countDownLatch.countDown();
                }
//                System.out.println(countDownLatch.getCount());
            });
        }
        countDownLatch.await();
        System.out.println("end");
        executorService.shutdown();

        List<String> list = new ArrayList<>(5);
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        list.remove("a");
        System.out.println(JSONObject.toJSONString(list));
    }
}

