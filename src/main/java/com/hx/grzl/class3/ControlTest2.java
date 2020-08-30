package com.hx.grzl.class3;

import java.util.Scanner;

/**
 * 习题2：自己实现一个函数，在一句话中查找某个单词的算法，存在返回索引号，否则返回False
 * <p>
 * 提示：使用句子中的坐标遍历句子的每一个位置，使用查找单词的长度结合使用切片来查找单词。例如：s[i:i+len(单词)]
 * <p>
 * def findWord(s,word):
 * length = len(word)
 * for i in range(len(s)-length+1):
 * if s[i:i+length] == word:
 * return i
 * return -1
 * print(findWord("I am a good boy","good"))
 * print(findWord("I am good","good"))
 **/
public class ControlTest2 {


    public static int findWord(String s, String word) {
        int len = word.length();
        for (int i = 0; i < s.length() - len + 1; i++) {
            if (s.substring(i, i + len).equals(word)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("I am a good boy".indexOf("good"));
        System.out.println(findWord("I am a good boy", "good"));
    }
}
