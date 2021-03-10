package com.hx.grzl.preclass.claz18.pro4_enum;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2021-03-03 16:48
 **/

public enum DayDemo4 {
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日");//记住要用分号结束

    private String desc;//中文描述

    /**
     * 私有构造,防止被外部调用
     * @param desc
     */
    DayDemo4(String desc){
        this.desc=desc;
    }

    /**
     * 定义方法,返回描述,跟常规类的定义没区别
     * @return
     */
    public String getDesc(){
        return desc;
    }


    public static void main(String[] args){

//        Enum types cannot be instantiated
//        new Day2("monday");

        for (DayDemo4 day: DayDemo4.values()) {
            System.out.println("name:"+day.name()+
                    ",desc:"+day.getDesc());

            //既然enum类跟常规类的定义没什么区别（实际上enum还是有些约束的），
            // 那么覆盖父类的方法也不会是什么难说，可惜的是父类Enum中的定义的方法只有toString方法没有使用final修饰，
            // 因此只能覆盖toString方法，如下通过覆盖toString省去了getDesc方法：
//            System.out.println(day);
//            System.out.println("------------");
        }
    }

    @Override
    public String toString() {
        return "this is"+desc;
    }

    /**
     输出结果:
     name:MONDAY,desc:星期一
     name:TUESDAY,desc:星期二
     name:WEDNESDAY,desc:星期三
     name:THURSDAY,desc:星期四
     name:FRIDAY,desc:星期五
     name:SATURDAY,desc:星期六
     name:SUNDAY,desc:星期日
     */
}
