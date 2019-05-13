package com.hx.hxdemo.practice.designmoudle.decorator;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw(){
        shape.draw();
        setBorder(shape);
    }

    private void setBorder(Shape shape) {
        System.out.println("with red border.");
    }
}
