package com.hx.hxdemo.practice.proxy.static_proxy;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2019-12-27 18:39
 **/
public class ProxyClient {

    public static void main(String[] args) {
        ProxyClass pc = new ProxyClass(new DealClass());
        pc.deal();
    }
}
