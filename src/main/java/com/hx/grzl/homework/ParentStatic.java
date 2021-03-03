package com.hx.grzl.homework;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2021-02-03 17:39
 **/
// 父类
public class ParentStatic {
    private static String pstr = "父类静态变量";

    static {
        System.out.println("执行父类静态代码块：" + pstr);
    }

    public ParentStatic() {
        System.out.println("执行父类构造方法。。。");
    }
    public static void main(String[] args) {
//        ChildStatic childStatic1 = new ChildStatic();
//        System.out.println("类静态代码块只会在加载该类时执行一次。。。");
        ChildStatic childStatic2 = new ChildStatic();

        boolean x = childStatic2 instanceof ChildStatic;
        System.out.println(x);
    }

}


class ChildStatic extends ParentStatic {
    private static String cstr = "子类静态变量";

    static {
        System.out.println("执行子类静态代码块：" + cstr);
    }

    public ChildStatic() {
        System.out.println("执行子类构造方法。。。");
    }



}