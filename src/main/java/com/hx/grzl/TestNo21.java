package com.hx.grzl;

/**
 * 习题21、二进制转换为十进制
 **/
public class TestNo21 {

    /*public int binaryToDecimal(String inMsg){
        int x = 0;
        int mul = 1;
        for(int i = inMsg.length()-1;i>0;i--){
            x += mul*(inMsg.charAt(i)=='1'?1:0);
            mul*=2;
        }
        System.out.println(mul);
        return mul;
    }*/

    public int binaryToDecimal1(String radix){
        int x = 0;
        for(char c:radix.toCharArray())
            x = x*2 + (c=='1'?1:0);
        System.out.println(x);
        return x;
    }

    public static void main(String[] args) {
        String a = "1010";
        int d = Integer.valueOf(a, 2); // 2进制
        System.out.println(d);

        // 实现函数
        new TestNo21().binaryToDecimal1(a);

    }
}
