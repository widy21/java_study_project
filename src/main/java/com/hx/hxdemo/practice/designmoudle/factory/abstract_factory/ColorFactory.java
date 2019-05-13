package com.hx.hxdemo.practice.designmoudle.factory.abstract_factory;

import com.hx.hxdemo.practice.designmoudle.factory.vo.RedColor;
import com.hx.hxdemo.practice.designmoudle.factory.vo.YellowColor;
import com.hx.hxdemo.practice.designmoudle.factory.vo.abstractVo.Color;
import com.hx.hxdemo.practice.designmoudle.factory.vo.abstractVo.Fruit;

public class ColorFactory extends AbstractFactory {
    @Override
    public Fruit getFruit(String name) {
        return null;
    }

    @Override
    public Color getColor(String name) {
        if(name.equals("red")){
            return new RedColor();
        }
        if(name.equals("yellow")){
            return new YellowColor();
        }
        return null;
    }
}
