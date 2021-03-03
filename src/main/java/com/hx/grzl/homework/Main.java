package com.hx.grzl.homework;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2021-02-03 19:04
 **/
public class Main {
    public static void main(String[] args) {
//        Weekday day = Weekday.SUN;
//        if (day == Weekday.SAT || day == Weekday.SUN) {
//            System.out.println("Work at home!");
//        } else {
//            System.out.println("Work at office!");
//        }

        System.out.println(Weekday.SUN == Weekday.SAT);
    }
}

enum Weekday {
    SUN, MON, TUE, WED, THU, FRI, SAT;
}

enum Color {
    RED, GREEN, BLUE;
}

