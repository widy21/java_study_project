package com.hx.grzl.test;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2021-01-27 17:44
 **/

class Block {
    static {
        System.out.println("我是静态代码块1");  //只在第一次调用的时候执行,优先级最高
    }

    {
        System.out.println("我是构造代码块"); //每次被新对象调用时都执行,优先级在静态代码块之后
    }

    static {
        System.out.println("我是静态代码块");  //只在第一次调用的时候执行,优先级最高
    }

    public void method() {
        System.out.println("我是成员方法");
    }

    public Block() {
        super();
        System.out.println("我是无参构造方法");

    }


}


    public class ARRTEXT {

    public static void test(){
        {
            String a="我是局部代码块1";
            System.out.println(a);
        }

    }

    public static void main(String[] args) {
//        {
//            String a="我是局部代码块";
//            System.out.println(a);
//        }
//        test();

        //System.out.println(a);  报错局部代码块内的变量在代码块外不能访问,代码块执行完后就会被回收
//        System.out.println();
        Block b=new Block();
//        System.out.println();
//        new Block();
//        b.method();
//        System.out.println();
//        Block c=new Block();
//        c.method();

    }

}
