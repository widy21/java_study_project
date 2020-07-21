package com.hx.grzl.class1;

import java.util.ArrayList;
import java.util.List;

/**
 * 习题14、把字符串中的所有数字去掉。
 * Created by huaxiao on 2020/4/6.
 */
public class TestNo14 {

    public static void main(String[] args) {
        String s = "a1b2c3b4d5dddddd";
        List<String> ret = new ArrayList<>();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if(!"0123456789".contains(String.valueOf(charArray[i]))){
                ret.add(String.valueOf(charArray[i]));
            }
        }
        System.out.println(String.join(",",ret));
    }
}
