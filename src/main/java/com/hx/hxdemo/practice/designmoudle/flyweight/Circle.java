package com.hx.hxdemo.practice.designmoudle.flyweight;

public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int rad;

    public Circle(String color) {
        this.color = color;
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getRad(){
        return rad;
    }

    public void setRad(int rad){
        this.rad = rad;
    }

    @Override
    public void draw() {
        System.out.println(String.format("draw():Circle[color:{%s},x:{%s},y:{%s},rad:{%s}", color, x, y, rad));
    }
}
