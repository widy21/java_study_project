package com.hx.hxdemo.practice.designmoudle.factory.test;

import com.hx.hxdemo.practice.designmoudle.factory.abstract_factory.ColorFactory;
import com.hx.hxdemo.practice.designmoudle.factory.abstract_factory.FruitFactory;

public class TestAbstractFactory {

    public static void main(String[] args) {
        FruitFactory fruitFactory = new FruitFactory();
        ColorFactory colorFactory = new ColorFactory();
        //apple
        fruitFactory.getFruit("apple").sayName();
        colorFactory.getColor("red").drawColor();
        //pair
        fruitFactory.getFruit("pair").sayName();
        colorFactory.getColor("yellow").drawColor();
    }
}
