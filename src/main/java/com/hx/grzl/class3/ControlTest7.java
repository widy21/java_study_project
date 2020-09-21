package com.hx.grzl.class3;

/**
 * 习题7：判断一个数是否是素数。
 **/
public class ControlTest7 {

    /**
     * 1. 根据概念判断:
     *
     * 如果一个正整数只有两个因子, 1和p，则称p为素数.
     * @param n
     * @return
     */
    public boolean isPrime(int n)

    {

        if(n < 2) return false;

        for(int i = 2; i < n; ++i)

            if(n%i == 0) return false;

        return true;

    }

    /**2. 改进, 去掉偶数的判断
    时间复杂度O(n/2), 速度提高一倍.*/

    public boolean isPrime1(int n)

    {

        if(n < 2) return false;

        if(n == 2) return true;

        if(n%2==0) return false;

        for(int i = 3; i < n; i += 2)

            if(n%i == 0) return false;

        return true;

    }

    /**3. 进一步减少判断的范围

    定理: 如果n不是素数, 则n有满足1< d<=sqrt(n)的一个因子d.

    证明: 如果n不是素数, 则由定义n有一个因子d满足1< d< n.
    如果d大于sqrt(n), 则n/d是满足1< n/d<=sqrt(n)的一个因子.
    时间复杂度O(Math.sqrt(n)/2), 速度提高O((n-Math.sqrt(n))/2).*/

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
        System.out.println(new ControlTest7().isPrime(2));
        System.out.println(new ControlTest7().isPrime(12));
        System.out.println(new ControlTest7().isPrime(13));
        System.out.println();
        System.out.println(new ControlTest7().isPrime1(2));
        System.out.println(new ControlTest7().isPrime1(12));
        System.out.println(new ControlTest7().isPrime1(13));
        System.out.println();
        System.out.println(new ControlTest7().isPrime2(2));
        System.out.println(new ControlTest7().isPrime2(12));
        System.out.println(new ControlTest7().isPrime2(13));
        System.out.println();
    }
}
