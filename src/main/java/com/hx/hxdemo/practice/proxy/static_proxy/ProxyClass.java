package com.hx.hxdemo.practice.proxy.static_proxy;

import javax.lang.model.type.DeclaredType;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2019-12-27 18:37
 **/
public class ProxyClass implements DealInterface {

    private DealClass dc;

    public ProxyClass(DealClass dc) {
        this.dc = dc;
    }

    @Override
    public void deal() {
        System.out.println("begin proxy...........");
        dc.deal();
        System.out.println("after proxy...........");

    }
}
