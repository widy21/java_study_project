package com.hx.grzl.preclass.claz19.homework.pro2;

/**
 * @program: hx-demo
 * @description: 不同几何图形的面积计算公式是不同的，但是它们具有的特性是相同的，
 * 都具有长和宽这两个属性，也都具有面积计算的方法。那么可以定义一个抽象类，
 * 在该抽象类中含有两个属性（width 和 height）和一个抽象方法 area( )
 **/
public abstract class Shape {
    public int width; // 几何图形的长
    public int height; // 几何图形的宽

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public abstract double area(); // 定义抽象方法，计算面积
}
