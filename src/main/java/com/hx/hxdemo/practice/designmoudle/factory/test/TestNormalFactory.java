package com.hx.hxdemo.practice.designmoudle.factory.test;

import com.hx.hxdemo.practice.designmoudle.factory.normal_factory.AppleFactory;
import com.hx.hxdemo.practice.designmoudle.factory.normal_factory.PairFactory;

public class TestNormalFactory {
    public static void main(String[] args) {
        new AppleFactory().getFruit().sayName();
        new PairFactory().getFruit().sayName();
    }
}
