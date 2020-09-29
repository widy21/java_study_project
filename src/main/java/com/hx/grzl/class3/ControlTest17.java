package com.hx.grzl.class3;

/**
 *习题17：统计单词中包含字母a的单词个数
 *
 *s="i am a boy!"
 * count=0
 * list1=s.split()
 * for value in list1:
 *     if "a" in value:
 *         count+=1
 * print(count)
 *
 **/
public class ControlTest17 {

    public static void main(String[] args) {
        String s="i am a boy!";
        int count = 0;
        char[] arr = s.toCharArray();
        for (char s1 : arr) {
            if(s1=='a'){
                count++;
            }
        }
        System.out.println("count="+count);
    }
}
