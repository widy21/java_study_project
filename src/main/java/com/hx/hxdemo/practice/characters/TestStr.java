package com.hx.hxdemo.practice.characters;

import org.apache.commons.lang3.StringUtils;

public class TestStr {
    public static void main(String[] args) {
        String s = " aaa";
        String s1 = " aaa\n";
        String s2 = " aaa    ";
        System.out.println(StringUtils.trim(s));
        System.out.println(StringUtils.strip(s1,"\n"));
        System.out.println(StringUtils.strip(s2,""));
    }
}
