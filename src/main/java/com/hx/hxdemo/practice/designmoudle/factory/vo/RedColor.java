package com.hx.hxdemo.practice.designmoudle.factory.vo;

import com.hx.hxdemo.practice.designmoudle.factory.vo.abstractVo.Color;

public class RedColor extends Color {
    @Override
    public void drawColor() {
        System.out.println("drawing red color...");
    }
}
