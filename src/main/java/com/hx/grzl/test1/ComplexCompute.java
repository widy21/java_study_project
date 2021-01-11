package com.hx.grzl.test1;

import com.hx.grzl.test.Compute;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2021-01-06 14:43
 * @date 2021-01-06 14:44
 * @author huaxiao
 **/
public class ComplexCompute extends Compute {
    public String getName(){
        return name;//可以访问其他包中基类的protected变量
    }
    public float add(float a,float b){

        return compute(a,b);//可以访问其他包中基类的protected方法
    }


    private String getAtrr1(){
        return null;
    }

}
