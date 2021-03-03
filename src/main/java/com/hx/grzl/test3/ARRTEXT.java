package com.hx.grzl.test3;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2021-01-27 18:00
 **/
class Block{

    {
        System.out.println("我是父类构造代码块");
    }
    static {
        System.out.println("我是父类静态代码块");
    }
    public void method() {
        System.out.println("我是成员方法");
    }
    public Block() {
        super();
        System.out.println("我是父类无参构造方法");

    }



}
class app extends Block{
    static {
        System.out.println("我是子类的静态代码块");
    }
    {
        System.out.println("我是子类的构造代码块");
    }
    public app() {

        System.out.println("我是子类无参构造方法");
    }

    public void method() {
        System.out.println("我是成员方法");
    }

}
public class ARRTEXT {
    public static void main(String[] args) {
//        new Block();
        app a=new app();


    }
}
/*输出为:
我是父类静态代码块
我是子类的静态代码块
我是父类构造代码块
我是父类无参构造方法
我是子类的构造代码块
我是子类无参构造方法
 * */
