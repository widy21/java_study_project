package com.hx.grzl;

import java.util.Scanner;

/**
 * 课后习题15、 现有面包、热狗、番茄酱、芥末酱以及洋葱，数字显示有多少种订购组合，
 * 其中面包必订，0不订，1订，比如10000，表示只订购面包
 *
 **/
public class HomeWorkNo15 {
    public static void main(String[] args) {
        int comp=0;
        for(int a=1;a<=1;a++){
            for(int b=0;b<=1;b++){
                for(int c=0;c<=1;c++){
                    for(int d=0;d<=1;d++){
                        System.out.println(a+""+b+c+d);
                        comp++;
                    }
                }
            }
        }
        System.out.println(String.format("共有%d种订购组合" ,comp));
    }
}
