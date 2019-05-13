package com.hx.hxdemo.practice.designmoudle.factory.abstract_factory;

import com.hx.hxdemo.practice.designmoudle.factory.vo.abstractVo.Color;
import com.hx.hxdemo.practice.designmoudle.factory.vo.abstractVo.Fruit;

public abstract class AbstractFactory {
    public abstract Fruit getFruit(String name);
    public abstract Color getColor(String name);
}
