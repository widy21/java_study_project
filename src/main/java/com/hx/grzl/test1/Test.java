package com.hx.grzl.test1;

import com.hx.grzl.test.Compute;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2021-01-06 14:55
 **/
public class Test {

    public static void main(String[] args) {
        ComplexCompute cc = new ComplexCompute();
        System.out.println(cc.getName());
//        System.out.println(cc.name);//不可以直接访问其他包的protected变量
//        System.out.println(cc.compute(1.1f,2f));//不可以访问其他包基类的protected方法
//        SimpleCompute simpleCompute = new SimpleCompute();
//        System.out.println(simpleCompute.getAtrr());
//        System.out.println(simpleCompute.name);
//        System.out.println(simpleCompute.compute(1.1f, 2f));
    }

}
