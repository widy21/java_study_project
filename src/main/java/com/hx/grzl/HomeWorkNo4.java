package com.hx.grzl;

import java.text.DecimalFormat;

/**
 * 课后习题4、3个人在餐厅吃饭，想分摊饭费。总共花费35.27美元，
 * 他们还想给15%的小费。每个人该怎么付钱，编程实现
 **/
public class HomeWorkNo4 {
    public static void main(String[] args) {
        double d = 0.200;
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println(35.27*1.15/3);
        System.out.println(df.format(35.27*1.15/3));
    }
}
