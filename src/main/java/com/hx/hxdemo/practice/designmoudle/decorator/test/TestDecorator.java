package com.hx.hxdemo.practice.designmoudle.decorator.test;

import com.hx.hxdemo.practice.designmoudle.decorator.Circle;
import com.hx.hxdemo.practice.designmoudle.decorator.RedShapeDecorator;
import com.hx.hxdemo.practice.designmoudle.decorator.Square;

public class TestDecorator {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        circle.draw();
        square.draw();
        RedShapeDecorator redCircle = new RedShapeDecorator(circle);
        RedShapeDecorator redSquare = new RedShapeDecorator(square);
        redCircle.draw();
        redSquare.draw();
    }
}
