package com.hx.hxdemo.practice.map;

import java.util.HashMap;

public class TestMap {

    public static void main(String[] args) {
        HashMap<String,String> m1 = new HashMap<>();
        m1.put("a1", "a1");
        HashMap<String,String> m2 = new HashMap<>();
//        HashMap<String,String> m2 = new HashMap<>(m1);//no
//        m2 = m1;//no
        m2.putAll(m1);
        m2.put("a2", "a2");

//        m1.putAll(m2);
//        m2.put("new", "new");
        System.out.println(m1);


    }
}
