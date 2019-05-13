package com.hx.hxdemo.practice.designmoudle.factory.vo;
import com.hx.hxdemo.practice.designmoudle.factory.vo.abstractVo.Fruit;

public class Pair extends Fruit {
    @Override
    public void sayName() {
        System.out.println("this is pair");
    }
}
