package com.hx.grzl.test2.sub;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2021-01-06 17:44
 **/
public class Test {
    public static void main(String[] args) {
        ComplexCompute cc = new ComplexCompute();
//        System.out.println(cc.name);//不可以直接访问其他包的protected变量
//        System.out.println(cc.compute(1.1f,2f));//不可以访问其他包基类的protected方法
    }

}
