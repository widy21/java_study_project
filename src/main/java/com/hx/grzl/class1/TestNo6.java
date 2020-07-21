package com.hx.grzl.class1;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * 习题6：py2 ：声明str类型变量和unicode变量，将unicode变量变为2个str变量（gbk，utf-8各一次）
 * 将utf-8编码的str类型，转换为gbk
 * Created by huaxiao on 2020/4/6.
 */
public class TestNo6 {
    /**
     * 字符串转unicode
     *
     * @param str
     * @return
     */
    public static String stringToUnicode(String str) {
        StringBuffer sb = new StringBuffer();
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            sb.append("\\u" + Integer.toHexString(c[i]));
        }
        return sb.toString();
    }

    /**
     * unicode转字符串
     *
     * @param unicode
     * @return
     */
    public static String unicodeToString(String unicode) {
        StringBuffer sb = new StringBuffer();
        String[] hex = unicode.split("\\\\u");
        for (int i = 1; i < hex.length; i++) {
            int index = Integer.parseInt(hex[i], 16);
            sb.append((char) index);
        }
        return sb.toString();

    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        String str1 = "水电费了会计师福建省来访接待室浪费空间";
        String uStr2 = stringToUnicode("中国了空间乱收费的健康");
        System.out.println(uStr2);

        String utfUnicodeStr = URLEncoder.encode(uStr2,"utf-8");
        String gbkUnicodeStr = URLEncoder.encode(uStr2,"gbk");
        System.out.println(utfUnicodeStr);
        System.out.println(gbkUnicodeStr);

        String gbkStr = URLEncoder.encode(URLEncoder.encode(str1,"utf-8"),"gbk");
        System.out.println(gbkStr);


    }
}
