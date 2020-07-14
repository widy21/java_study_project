package com.hx.hxdemo.practice.lock;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2020-07-03 15:14
 **/
public class ConcurrentModificationExceptionTest {

    public static void main(String[] args)  {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer integer = iterator.next();
            if(integer==2){
                list.remove(integer);
            }
//                iterator.remove();
        }

//        for(Integer i: list){
//            list.remove(i);
//        }
        System.out.println(list.toString());
    }
}
