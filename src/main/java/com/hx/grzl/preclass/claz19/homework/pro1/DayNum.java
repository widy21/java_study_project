package com.hx.grzl.preclass.claz19.homework.pro1;

/**
 * @description: 1、	定义一个类DayNum，
 * 声明并初始化7个int类型常量（周一 ~ 周日）；
 * 定义测试类 TestDay，打印每一天对应的中文描述（如：星期一、星期二）。
 **/
public class DayNum {
    public static final int MONDAY =1;

    public static final int TUESDAY=2;

    public static final int WEDNESDAY=3;

    public static final int THURSDAY=4;

    public static final int FRIDAY=5;

    public static final int SATURDAY=6;

    public static final int SUNDAY=7;

    public void printCurrentDay(int dayNum){
        switch (dayNum){
            case DayNum.MONDAY:
                System.out.println("星期一");
                break;
            case DayNum.TUESDAY:
                System.out.println("星期二");
                break;
            case DayNum.WEDNESDAY:
                System.out.println("星期三");
                break;
            case DayNum.THURSDAY:
                System.out.println("星期四");
                break;
            case DayNum.FRIDAY:
                System.out.println("星期五");
                break;
            case DayNum.SATURDAY:
                System.out.println("星期六");
                break;
            case DayNum.SUNDAY:
                System.out.println("星期日");
                break;
            default:
                System.out.println("星期x");
        }
    }

}

class TestDay{
    public static void main(String[] args) {
        DayNum dayNum = new DayNum();
        dayNum.printCurrentDay(1);
        dayNum.printCurrentDay(2);
        dayNum.printCurrentDay(3);
        dayNum.printCurrentDay(4);
        dayNum.printCurrentDay(5);
        dayNum.printCurrentDay(6);
        dayNum.printCurrentDay(7);
        dayNum.printCurrentDay(8);
    }
}
