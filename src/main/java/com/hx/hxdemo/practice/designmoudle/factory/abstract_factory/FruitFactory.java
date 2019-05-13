package com.hx.hxdemo.practice.designmoudle.factory.abstract_factory;

import com.hx.hxdemo.practice.designmoudle.factory.vo.Apple;
import com.hx.hxdemo.practice.designmoudle.factory.vo.Pair;
import com.hx.hxdemo.practice.designmoudle.factory.vo.abstractVo.Color;
import com.hx.hxdemo.practice.designmoudle.factory.vo.abstractVo.Fruit;

public class FruitFactory extends AbstractFactory{
    @Override
    public Fruit getFruit(String name) {
        if(name.equals("apple")){
            return new Apple();
        }
        if(name.equals("pair")){
            return new Pair();
        }
        return null;
    }

    @Override
    public Color getColor(String name) {
        return null;
    }
}
