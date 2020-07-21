package com.hx.grzl.class2;

import java.util.Scanner;

/**
 * 课后习题9、一家商场在降价促销。如果购买金额50-100元（包含50元和100元）之间，
 * 会给10%的折扣，如果购买金额大于100元会给20%折扣。编写一程序，询问购买价格，
 * 再显示出折扣（10%或20%）和最终价格
 **/
public class HomeWorkNo9 {
    public static void main(String[] args) {
        System.out.println("input the amount: ");
        Scanner sc=new Scanner(System.in);
        String str=new String();
        str=sc.nextLine();
        int amount = Integer.parseInt(str);

        if (amount >= 50 && amount <= 100){
            System.out.println("the sale 0.9.");
            System.out.println("the final price is :"+amount*0.9);
        }else if (amount > 100){
            System.out.println ("the sale 0.8.");
            System.out.println("the final price is :"+amount*0.8);
        }

    }
}
