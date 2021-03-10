package com.hx.grzl.preclass.claz19.test_interface1;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2021-03-10 17:46
 **/
public class Swallow implements Bird {
    @Override
    public void fly() {
        System.out.println("燕子会飞");

    }

    @Override
    public void sing() {
        System.out.println("燕子会唱歌");
    }

    public static void main(String[] args) {
        Swallow swallow = new Swallow();
        swallow.fly();
        swallow.sing();
    }
}
