package com.hx.hxdemo.practice.proxy.static_proxy;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2019-12-27 18:36
 **/
public class DealClass implements DealInterface {
    @Override
    public void deal() {
        System.out.println("dealling...");
    }
}
