package com.hx.hxdemo.practice.designmoudle.factory.test;

import com.hx.hxdemo.practice.designmoudle.factory.simple_factory.SimpleFactory;

public class TestSimpleFactory {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.getFruit("apple").sayName();
        simpleFactory.getFruit("pair").sayName();
    }
}
