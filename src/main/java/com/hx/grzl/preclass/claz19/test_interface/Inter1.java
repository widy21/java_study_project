package com.hx.grzl.preclass.claz19.test_interface;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2021-03-10 17:11
 **/
public interface Inter1{
    public static final String b = "b";
    String name="Inter1";    // 不合法，变量name必须初始化
    int age = 20;    // 合法，等同于 public static final int age = 20;
    void getInfo();    // 方法声明，等同于 public abstract void getInfo();
}

interface Inter2 extends Inter1{
    int age = 30;
//    void getInfo();
}

interface Inter3 extends Inter1, Inter2{
//    default void getInfo() {
//        System.out.println("sub info1");
//    }
}

class Sub implements Inter3{

    @Override
    public void getInfo() {
        System.out.println("sub info");
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        System.out.println(Inter1.age);
        System.out.println(Inter2.age);
        System.out.println(sub.name);
        System.out.println(Inter1.b);
        sub.getInfo();
    }
}