package com.hx.grzl;

import java.util.ArrayList;
import java.util.List;

/**
 * 习题13：自定义divmod
 * Created by huaxiao on 2020/4/6.
 */
public class TestNo13 {

    public static List divmod(int a, int b){
        List<Integer> ret = new ArrayList<>();
        ret.add(a/b);
        ret.add(a%b);
        return ret;
    }
    public static void main(String[] args) {

        System.out.println(divmod(7,3));
        System.out.println(divmod(8,2));
    }
}
