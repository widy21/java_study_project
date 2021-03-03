package com.hx.grzl.test3;

import java.util.concurrent.TimeUnit;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2021-01-27 18:33
 **/
public class MyTask implements Runnable
{
    private volatile boolean active;
    public void run()
    {
        active = true;
        while (active) // 第一行
        {
            // 代码
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" running...");
        }
    }


    public void stop()
    {
        System.out.println(Thread.currentThread().getName()+" stopping...");
        active = false; // 第二行
    }

    public static void main(String[] args) {
        MyTask task = new MyTask();
        new Thread(task).start();
        task.stop();
    }
}

