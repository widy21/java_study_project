package com.hx.hxdemo.practice.designmoudle.factory.normal_factory;

import com.hx.hxdemo.practice.designmoudle.factory.vo.Apple;
import com.hx.hxdemo.practice.designmoudle.factory.vo.abstractVo.Fruit;

public class AppleFactory extends AbstractFactory{
    public Fruit getFruit(){
        return new Apple();
    }
}
