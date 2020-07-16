package com.hx.grzl;

/**
 * 课后习题16 、基于上题：给出每种食物的卡路里（自定义），再计算出每种组合总共的卡路里
 *
 **/
public class HomeWorkNo16 {
    public static void main(String[] args) {
        int comp=0;
        for(int a=1;a<=1;a++){
            for(int b=0;b<=1;b++){
                for(int c=0;c<=1;c++){
                    for(int d=0;d<=1;d++){
                        System.out.println(a+""+b+c+d+"卡路里="+(a*100+(b)*200+(c)*300+(d)*400));
                        comp++;
                    }
                }
            }
        }
        System.out.println(String.format("共有%d种订购组合" ,comp));
    }
}
