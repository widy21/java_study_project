package com.hx.hxdemo.practice.constructor;

public class Son  extends Parent{

    String myName;
    public Son(){
        /*
        子类如果不显式super调用父类带参构造，则默认会调用父类无参构造，
        此时如果父类没有无参构造，就会报错。
         */
        super("aaa");
    }
}
