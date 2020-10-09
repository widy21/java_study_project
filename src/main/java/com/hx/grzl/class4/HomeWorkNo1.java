package com.hx.grzl.class4;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 1.	使用尽可能多的方法实现list去重
 **/
public class HomeWorkNo1 {


    /**
     * 第一种方法
     * 是大家最容易想到的，先把List数据放入Set，因为Set数据结构本身具有去重的功能，所以再将SET转为List之后就是去重之后的结果。
     * 这种方法在去重之后会改变原有的List元素顺序，因为HashSet本身是无序的，而TreeSet排序也不是List种元素的原有顺序。
     *
     * @param list
     */
    public void testRemove1(List list) {
        Set<String> set = new HashSet<>(list);
        List<String> newList = new ArrayList<>(set);
//去重并排序的方法(如果是字符串，按字母表排序。如果是对象，按Comparable接口实现排序)
//        List<String> newList = new ArrayList<>(new TreeSet<>(list));

        System.out.println("去重后的集合： " + newList);
    }

    /**
     * 第二种方法
     * 使用就比较简单，先用stream方法将集合转换成流，然后distinct去重，最后在将Stream流collect收集为List。
     * @param list
     */
    public void testRemove2(List list)  {
        List<String> newList = (List<String>) list.stream().distinct().collect(Collectors.toList());

        System.out.println( "去重后的集合： " + newList);
    }

    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("b");
        HomeWorkNo1 no1 = new HomeWorkNo1();
        no1.testRemove1(list);
        no1.testRemove2(list);
    }
}
