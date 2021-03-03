package com.hx.grzl.preclass.claz18.pro4_enum;

import com.hx.grzl.preclass.claz18.pro1.A;

//枚举类型，使用关键字enum
enum Day{
    MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

class EnumDemo{

    public static void main(String[] args) {
        //直接引用
        Day day = Day.MONDAY;

        //Day.MONDAY也是Day类型。
        System.out.println(day instanceof Day);

        System.out.println(Day.TUESDAY.name());

//        System.out.println("MONDAY".equals(day)); false

        System.out.println(Day.TUESDAY == day);
        System.out.println(Day.TUESDAY.compareTo(day));
        System.out.println(Day.MONDAY.compareTo(day));

//        Day day1 = Day.valueOf("MONDAY");
//        System.out.println("day:"+day1);


    }
}