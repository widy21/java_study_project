package com.hx.grzl.test;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2021-01-06 15:45
 **/
public class SingleTon {

//    private static SingleTon singleTon = new SingleTon();
    private static SingleTon singleTon;
    public static Object obj = new Object();

    private SingleTon(){

    }

    public static SingleTon getSingleTon(){
        if(singleTon == null){
            System.out.println("singleton is null...");
            singleTon = new SingleTon();
        }
        System.out.println("singleton is not null...");
        return singleTon;
    }

//    public String toString(){
//        return "this is a singleton instance...";
//    }


//    @Override
//    public String toString() {
//        return "SingleTon{}"+this.getClass();
//    }
}
