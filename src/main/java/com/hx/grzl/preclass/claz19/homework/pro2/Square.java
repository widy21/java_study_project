package com.hx.grzl.preclass.claz19.homework.pro2;

public class Square extends Shape {
    public Square(int width, int height) {
        super(width, height);
    }

    // 重写父类中的抽象方法，实现计算正方形面积的功能
    @Override
    public double area() {
        return width * height;
    }
}
