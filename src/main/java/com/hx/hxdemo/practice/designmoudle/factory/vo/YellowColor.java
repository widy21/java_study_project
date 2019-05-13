package com.hx.hxdemo.practice.designmoudle.factory.vo;

import com.hx.hxdemo.practice.designmoudle.factory.vo.abstractVo.Color;

public class YellowColor extends Color {
    @Override
    public void drawColor() {
        System.out.println("drawing yellow color...");
    }
}
