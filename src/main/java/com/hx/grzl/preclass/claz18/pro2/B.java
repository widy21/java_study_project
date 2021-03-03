package com.hx.grzl.preclass.claz18.pro2;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2021-03-02 17:02
 **/
public class B  extends A{
    static int a = 3;
    static int b = 4;

    public static void printB() {
        // 如果B中没有重新定义b，这里调用的会是A.b，重新定义之后，调用的就是B.b
        System.out.println(b);
    }
}
