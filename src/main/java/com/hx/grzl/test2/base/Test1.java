package com.hx.grzl.test2.base;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2021-01-06 17:44
 **/
public class Test1 {
    public static void main(String[] args) {
//        ComplexCompute cc = new ComplexCompute();
//        System.out.println(cc.name);//不可以直接访问其他包的protected变量
//        System.out.println(cc.compute(1.1f,2f));//不可以访问其他包基类的protected方法

//        String s = new String("123");
//        String s = "123";
        Data data = new Data();
        data.name = "123";
        data.i = new Integer(200);
        change(data);

        System.out.println(data.name);
//        System.out.println(i);
//        System.out.println(data.name.hashCode());
        System.out.println(System.identityHashCode(data));
        System.out.println(System.identityHashCode(data.name));

    }

    private static void change(Data data) {
        data.name = "hi";
        data.i = 20;
        System.out.println(data.name);
//        System.out.println(data.name.hashCode());
//        System.out.println(System.identityHashCode(new Data()));
        System.out.println(System.identityHashCode(data));
        System.out.println(System.identityHashCode(data.name));
    }

}

class Data{
    String name;
    Integer i;
}