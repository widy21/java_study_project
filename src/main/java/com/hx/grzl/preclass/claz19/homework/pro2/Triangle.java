package com.hx.grzl.preclass.claz19.homework.pro2;

public class Triangle extends Shape {
    public Triangle(int width, int height) {
        super(width, height);
    }

    // 重写父类中的抽象方法，实现计算三角形面积的功能
    @Override
    public double area() {
        return 0.5 * width * height;
    }
}
