package com.hx.grzl.class1;

import java.util.Random;

/**
 * 习题19、生成9位数字和字母的密码
 * Created by huaxiao on 2020/4/7.
 */
public class TestNo19 {

    /**
     * 随机生成字母
     */
    private String genLetters() {
        String pwd = "";
        int max = 90;
        int min = 65;
        for (int i = 0; i < 9; i++) {
            int num = new Random().nextInt(max - min + 1) + min;
//            int num = min + (int)(Math.random() * ((max - min) + 1));
            String value = String.valueOf((char) (num));
            pwd += value;
        }
        return pwd;
    }

    /**
     * 随机生成数字
     */
    private String genNums() {
        String pwd = "";
        String str = "0123456789";
        for (int i = 0; i < 9; i++) {
            pwd += str.toCharArray()[new Random().nextInt(10)];
        }
        return pwd;
    }

    public static void main(String[] args) {
        int nextInt = new Random().nextInt(2);
        System.out.println("nextInt="+nextInt);
        TestNo19 util = new TestNo19();
        // 如果是随机生成的是1，则生成一个字母密码元素
        if(nextInt == 1){
            System.out.println(util.genLetters());
        }else {//否则生成数字密码元素
            System.out.println(util.genNums());
        }
    }
}
