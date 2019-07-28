package com.hx.hxdemo.algorithm;

/**
 * 数字反转，v2.
 */
public class Solution {

    public int reverse(int x){
        int result = 0;
        while (x!=0){
            int mod=x%10;
            System.out.println("mod="+mod);
            x=x/10;
            result = result*10+mod;

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverse(123));
    }
}
