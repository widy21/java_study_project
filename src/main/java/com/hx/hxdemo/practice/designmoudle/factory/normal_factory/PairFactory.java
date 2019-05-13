package com.hx.hxdemo.practice.designmoudle.factory.normal_factory;

import com.hx.hxdemo.practice.designmoudle.factory.vo.Pair;
import com.hx.hxdemo.practice.designmoudle.factory.vo.abstractVo.Fruit;

public class PairFactory extends AbstractFactory{
    public Fruit getFruit(){
        return new Pair();
    }
}
