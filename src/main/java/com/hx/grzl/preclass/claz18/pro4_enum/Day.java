package com.hx.grzl.preclass.claz18.pro4_enum;

import com.hx.grzl.preclass.claz18.pro1.A;

//枚举类型，使用关键字enum
enum Day{
    MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

//    Cannot inherit from enum 'com.hx.grzl.preclass.claz18.pro4_enum.Day'
//class Day1 extends Day{
//
//}


class EnumDemo{

    public Day getCurrentDay(){
        return Day.MONDAY;
    }

    public static void main(String[] args) {
        //直接引用
        Day day = Day.MONDAY;

        //Day.MONDAY也是Day类型。
        System.out.println(day instanceof Day);

//        String	name()	返回此枚举常量的名称，在其枚举声明中对其进行声明
        System.out.println(Day.TUESDAY.name());

//        compareTo(E o)方法则是比较枚举的大小，注意其内部实现是根据每个枚举的ordinal值大小进行比较的。
//            --0：相同，1：不同
//        name()方法与toString()几乎是等同的，都是输出变量的字符串形式。

        System.out.println(Day.TUESDAY == day);
        System.out.println(Day.TUESDAY.compareTo(day));
        System.out.println(Day.MONDAY.compareTo(day));

//        Day day1 = Day.valueOf("MONDAY");
//        System.out.println("day:"+day1);


        //可以把逻辑抽象到方法中
        Day currentDay = new EnumDemo().getCurrentDay();
        System.out.println(currentDay.name());
        System.out.println(currentDay == Day.MONDAY);
    }
}