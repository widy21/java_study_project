package com.hx.grzl.class3;

/**
 * 习题8：求100以内的素数和。
 **/
public class ControlTest8 {


    public boolean isPrime2(int n)
    {

        if(n < 2) return false;

        if(n == 2) return true;

        if(n%2==0) return false;

        for(int i = 3; i*i <= n; i += 2)

            if(n%i == 0) return false;

        return true;

    }

    public static void main(String[] args) {
        int i = 0;
        ControlTest8 test8 = new ControlTest8();
        for (int j = 0; j < 100; j++) {
            if(test8.isPrime2(j)){
                i += j;
            }
        }
        System.out.println(i);
    }
}
