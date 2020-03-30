package com.hx.grzl;

import java.util.ArrayList;
import java.util.List;

/**
 * 习题3：生成字符串a1b2c3d4e5f6g7h8i9j10
 * Created by huaxiao on 2020/3/30.
 */
public class TestNo3 {

    public static void main(String[] args) {
//        foo1();
        foo2();
    }

    private static void foo2() {
        List<String> result = new ArrayList<>();
        for (int i = 97; i < 107; i++) {
            String s = (char) (i)+new Integer(i-96).toString();
//            s += new Integer(i-96).toString();
//            System.out.println(i-96);
            result.add(s);
        }
        System.out.println(String.join("",result));
    }

    private static void foo1() {
        String s = "";
        for (int i = 97; i < 107; i++) {
            s += (char) (i)+new Integer(i-96).toString();
//            s += new Integer(i-96).toString();
//            System.out.println(i-96);
        }
        System.out.println(s);
    }
}
