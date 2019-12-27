package com.hx.hxdemo.practice.proxy.cglib;


import net.sf.cglib.proxy.Enhancer;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2019-12-27 18:13
 **/
public class Client {

    public static void main(String[] args) {
        Enhancer eh  = new Enhancer();
        eh.setSuperclass(HelloServiceImpl.class);
        eh.setCallback(new HelloMethodInterceptor());
        HelloServiceImpl o = (HelloServiceImpl) eh.create();
        o.sayHello();
    }
}
