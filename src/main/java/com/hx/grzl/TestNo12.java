package com.hx.grzl;

/**
 * 习题12、自定义count函数
 * Created by huaxiao on 2020/4/6.
 */
public class TestNo12 {

    /**
     * 只统计单个字符出现次数情况
     *
     * @param s
     * @param letters
     * @return
     */
    public static int countLetter(String s, String letters) {
        if (s == null || letters == null) {
            return 0;
        }
        if (!(s instanceof String) || !(letters instanceof String)) {
            return 0;
        }

        int times = 0;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (letters.equals(String.valueOf(charArray[i]))) {
                times++;
            }
        }

        return times;
    }

    /**
     * 兼容统计多个字符出现次数的情况
     *
     * @param s
     * @param letters
     * @return
     */
    public static int countMulLetter(String s, String letters) {
        if (s == null || letters == null) {
            return 0;
        }
        if (!(s instanceof String) || !(letters instanceof String)) {
            return 0;
        }
        if (!s.contains(letters)) {
            return 0;
        }
        if (s.equals(letters)) {
            return 1;
        }

        int letterLen = letters.length();
        int times = 0;
        for (int i = 0; i < s.length() && i + letterLen <= s.length(); i++) {
            String subStr = s.substring(i, i + letterLen);
//            System.out.println(subStr);
            if (letters.equals(subStr)) {
                times++;
            }
        }

        return times;
    }

    public static void main(String[] args) {
//        System.out.println(countLetter("aaabbbcccc", "c"));
        System.out.println(countMulLetter("aaabbbcccc", "c"));
    }
}
