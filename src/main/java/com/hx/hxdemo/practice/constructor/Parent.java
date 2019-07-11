package com.hx.hxdemo.practice.constructor;

public class Parent {
    String name;


    /**
     * 必须有，否则子类报错。
     */
    public Parent(){
    }

    public Parent(String name){
        this.name = name;
    }
}
