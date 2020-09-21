package com.hx.grzl.class3;

/**
 * 练习9：使用 for 的方式，求一下100以内奇数之和
 **/
public class ControlTest9 {



    public static void main(String[] args) {
        int i = 0;
        for (int j = 0; j < 100; j++) {
            // 余数为1
            if(j%2 == 1){
                i += j;
            }
        }
        System.out.println(i);
    }
}
