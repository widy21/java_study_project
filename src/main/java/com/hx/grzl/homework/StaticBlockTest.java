package com.hx.grzl.homework;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2021-02-03 17:40
 **/
public class StaticBlockTest {

    public static void main(String[] args) {
        ChildStatic childStatic1 = new ChildStatic();
        ChildStatic childStatic2 = new ChildStatic();
        System.out.println("类静态代码块只会在加载该类时执行一次。。。");
    }
}
