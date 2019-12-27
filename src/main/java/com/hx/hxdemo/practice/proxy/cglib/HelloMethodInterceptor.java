package com.hx.hxdemo.practice.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2019-12-27 18:08
 **/
public class HelloMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before invoke...");
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("after invoke...");
        return o1;
    }
}
