package com.hx.grzl.class2;

import java.util.Scanner;

/**
 * 课后习题14、长途旅行中，刚到一个加油站，距下一个加油站还有200km，
 * 而且以后每个加油站之间距离都是200km。编写一个程序确定是不是需要在这里加油，
 * 还是可以等到接下来的第几个加油站再加油。
 **/
public class HomeWorkNo14 {
    public static void main(String[] args) {
        System.out.println("input the capacity: ");
        Scanner sc=new Scanner(System.in);
        String strCapacity=new String();
        strCapacity=sc.nextLine();
        float capacity = Float.parseFloat(strCapacity);

        System.out.println("input the remain: ");
        Scanner sc1=new Scanner(System.in);
        String strRemain=new String();
        strRemain=sc1.nextLine();
        float remain = Float.parseFloat(strRemain);

        System.out.println("iinput the distance: ");
        Scanner sc2=new Scanner(System.in);
        String strDistance=new String();
        strDistance=sc2.nextLine();
        int distance = Integer.parseInt(strDistance);

        float remainDistance = (capacity*remain-5)*distance;
        System.out.println("remainDistance="+remainDistance);
        if(remainDistance<200){
            System.out.println("当前加油站加油");
        }else {
            System.out.println(String.format("第%d个加油站加油",new Float(remainDistance).intValue()/200));
        }


    }
}
