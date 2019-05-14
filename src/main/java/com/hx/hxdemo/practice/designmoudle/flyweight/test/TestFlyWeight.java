package com.hx.hxdemo.practice.designmoudle.flyweight.test;

import com.hx.hxdemo.practice.designmoudle.flyweight.Circle;
import com.hx.hxdemo.practice.designmoudle.flyweight.CircleFactory;

public class TestFlyWeight {
    private static String[] colorArray = {"red","green","white","black","blue"};

    public static void main(String[] args) throws Exception{
        for(int i = 0;i<20;i++){
            Circle circle = (Circle)CircleFactory.getCircle(getRandomColor());
            circle.setX((int)(Math.random()*100));
            circle.setY((int)(Math.random()*100));
            circle.setRad((int)(Math.random()*100));
            circle.draw();
//            System.out.println(getRandomColor());
        }

//        String s = String.format("aaa{%s}","bbb");
//        System.out.println(s);
    }

    private static String getRandomColor(){
//        System.out.println((int)(Math.random()*10));
        return colorArray[(int)(Math.random()*colorArray.length)];
    }
}
