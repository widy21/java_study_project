package com.hx.grzl.preclass.claz18.pro2;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2021-03-02 17:02
 **/
public class TestOverrideStatic {
    public static void main(String[] args) {
        // B继承自A的静态方法，注意：B中虽然也定义了a的值(B.a)，但是因为调用的printA是A中的方法，他打印的是A中的静态变量a(A.a)的值
        B.printA(); //[1]
//        new B().printA();
        // 如果B中没有定义printB()，这里调用的会是A中的printB()，但是因为B中也定义了B的printB()，所以这里调用的是B自己的方法,所以
        //打印的也是B中静态变量b(B.b)的值
        B.printB(); //[2]
        // B也可以直接调用a,如果B中没有重新定义，就调用继承自A的a变量，重新定义了，就调用它自身的a
        System.out.println(B.a);



//        System.out.println(new C().s);
//        System.out.println(new C().t);
    }
}
