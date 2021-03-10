package com.hx.grzl.preclass.claz19.homework.test_volatile;

public class Exchanger{
    private Object object = null;
    private volatile boolean hasNewObject = false;

    public void put(Object newObject){
        while(hasNewObject){
            // 等待 ， 不要去覆盖object字段
        }
        object = newObject;     // 在写 volatile 之前进行的普通写
        hasNewObject =  true; // 写 volatile
    }

    public Object take(){
        while(! hasNewObject){ // 读 volatile
            // 等待， 不获取旧的 object或null
        }
        Object obj = object;      // 再写 volatile 之前进行的普通读
        hasNewObject = false; // 写 volatile
        return obj;
    }
}
