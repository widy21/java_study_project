package com.hx.grzl.test;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2021-02-02 17:57
 **/
public class ImmutableStrings {
    public static void main(String[] args)
    {
        String one = "someString";
        String two = "someString";

        System.out.println(one.equals(two));
        System.out.println(one == two);
    }
}
