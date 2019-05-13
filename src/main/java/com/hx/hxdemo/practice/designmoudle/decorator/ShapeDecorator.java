package com.hx.hxdemo.practice.designmoudle.decorator;

public class ShapeDecorator extends Shape {
    Shape shape;

    public ShapeDecorator(Shape shape){
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
