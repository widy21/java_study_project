package com.hx.grzl.preclass.claz18.homework.pro2;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2021-03-03 11:51
 **/
public class X {

    Y y = new Y();
    static {
        System.out.println("111");
    }

    X() {
        System.out.println("222");
    }

    public static void main(String[] args) {
        /**
         * 分析：
         *
         * 1.首先分析一段程序的执行后的结果，我们得先找到程序的入口，然后才能着手分析。也就是main()方法。
         * 2.我们发现main()方法在X类中，要执行main（）方法，还得先将X类加载到内存中。
         * 3.X类加载完成后，会做什么事情呢？别急，先来看看static的作用，不知道吧。告诉你：static就是在类被第一次加载的时候执行，以后就不再执行。
         * 4.知道了static的作用，那么X类被加载，那么就会先执行X类的静态属性和静态语句块（static），执行先后顺序看谁在前面就先执行谁。只在此时执行，以后都不会。
         * 5.所以一个输出结果为111,没问题了吧。
         * 6.X类的static语句块执行完了，就该执行main()方法啦。
         * 7.new Z();此方法被执行。
         * 8.既然new Z();那么Z类就要被加载。因为Z类继承X类。所以必须先加载X类才行。因为X类已经被加载。所以此时不用再加载X类了。Z类加载好了就要执行Z类的static语句块。
         * 9.那么就会打印出333了吧。
         * 10.都加在完后就要实例化对象了。
         * 11.实例化Z之前，还得先实例化X对吧。因为子类的构造方法都会调用父类的构造方法。
         * 12.那就先实例化X类吧。
         * 13.执行X方法前还得先初始化对不。也就是获取所有属性。那么X类的属性Y就会获取。
         * 14.即X类的Y y=new Y();要被执行。也就是会打印555。
         * 15.接着执行System.out.println("222");
         * 16.然后就是执行Z的构造方法。
         * 17.同样先获取Z的属性Y y=new Y();打印555。
         * 18.再执行System.out.println("444");
         */
        new Z();
    }
}
