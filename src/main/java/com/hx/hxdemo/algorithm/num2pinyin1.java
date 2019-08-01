package com.hx.hxdemo.algorithm;

import java.util.regex.Pattern;


public class num2pinyin1 {

    public static String numArray[] = {"Ling", "Yi", "Er", "San", "Si", "Wu", "Liu", "Qi", "Ba", "Jiu"};
    //int范围到十亿就足够了
    public static String pinyinArray[] = {"", "Shi", "Bai", "Qian", "Wan", "ShiWan", "BaiWan", "QianWan", "Yii", "ShiYii"};

    public static String Num2pinyin(int input) {
        StringBuilder sb = new StringBuilder();
        char[] nums = String.valueOf(input).toCharArray();
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i] - '0';
            sb.append(numArray[currentNum]);
            if (currentNum != 0)
                sb.append(pinyinArray[nums.length - 1 - i]);
        }
        String rst = sb.toString();
        //多个0替换成1个
        rst = rst.replaceAll("Ling(Ling)+", "Ling");
        //开头的“一十”换成“十”
        if (rst.startsWith("YiShi"))
            rst = rst.substring(2);

        //去掉末尾0
        if (rst.length() > 4 && rst.endsWith("Ling"))
            rst = rst.substring(0, rst.length() - 4);

        //出现多个亿的话只保留最后一个
        rst = remainLast(rst, "Yii");
        //亿后面再出现多个万的话只保留最后一个万
        rst = remainLast(rst, "Wan");
        return rst;
    }

    //str 中删掉所有content，只保留最后一个
    public static String remainLast(String str, String content) {
        while (str.indexOf(content) != str.lastIndexOf(content))
            str = str.replaceFirst(Pattern.quote(content), "");
        return str;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Num2pinyin(0));
        System.out.println(Num2pinyin(1));
        System.out.println(Num2pinyin(9));
        System.out.println(Num2pinyin(15));
        System.out.println(Num2pinyin(100));
        System.out.println(Num2pinyin(105));
        System.out.println(Num2pinyin(115));
        System.out.println(Num2pinyin(1001));
        System.out.println(Num2pinyin(2000));
        System.out.println(Num2pinyin(2100));
        System.out.println(Num2pinyin(2010));
        System.out.println(Num2pinyin(9999));
        System.out.println(Num2pinyin(10000));
        System.out.println(Num2pinyin(10001));
        System.out.println(Num2pinyin(10010));
        System.out.println(Num2pinyin(10100));
        System.out.println(Num2pinyin(21000));
        System.out.println(Num2pinyin(99999));
        System.out.println(Num2pinyin(100000));
        System.out.println(Num2pinyin(890909));
        System.out.println(Num2pinyin(2200000));
        System.out.println(Num2pinyin(2100000000));
    }

}
