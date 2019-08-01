package com.hx.hxdemo.algorithm;

import com.google.common.collect.Lists;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 数字转拼音
 */
public class Num2Pinyin {

    private static Map<Integer, String> numPinyin = new HashMap();
    private static Map<Integer, String> weiPinyin = new HashMap();

    static {
        numPinyin.put(0, "ling");
        numPinyin.put(1, "yi");
        numPinyin.put(2, "er");
        numPinyin.put(3, "san");
        numPinyin.put(4, "si");
        numPinyin.put(5, "wu");
        numPinyin.put(6, "liu");
        numPinyin.put(7, "qi");
        numPinyin.put(8, "ba");
        numPinyin.put(9, "jiu");

        weiPinyin.put(0, "");
        weiPinyin.put(1, "shi");
        weiPinyin.put(2, "bai");
        weiPinyin.put(3, "qian");
        weiPinyin.put(4, "wan");
        weiPinyin.put(5, "shiwan");
        weiPinyin.put(6, "baiwan");
        weiPinyin.put(7, "qianwan");
        weiPinyin.put(8, "yi");
        weiPinyin.put(9, "shiyi");
    }

    public String num2Pinyin(String word) {
        char[] arr = word.toCharArray();
        List ret = Lists.newArrayList();
        for (int i = 0; i < arr.length; i++) {
            // 数字拼音
            ret.add(numPinyin.get(arr[i]-'0'));

            // 位数拼音
            int index = arr.length - 1 - i;
            ret.add(weiPinyin.get(index));
        }
        return String.join("-", ret);
    }

    public static void main(String[] args) {
        System.out.println(new Num2Pinyin().num2Pinyin("123"));
        System.out.println(new Num2Pinyin().num2Pinyin("1000000"));
        System.out.println(new Num2Pinyin().num2Pinyin("1234555"));
    }
}
