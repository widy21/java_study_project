package com.hx.grzl.preclass.claz19.test_innerclass;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2021-03-10 18:11
 **/
public class Outer {
    private String outerValue = "outer";
    // 成员内部类，相当于外部类的一个成员变量
    public class Inner {
        private String innerValue = "inner";
        public void printInner(){
            System.out.println("访问外部类的私有属性:" + outerValue);
            System.out.println("访问内部类的私有属性:" + innerValue);
        }
    }
}

class Test {
    public static void main(String[] args) {
        // 01使用成员内部类
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.printInner();
    }
}
