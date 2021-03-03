package com.hx.grzl.preclass.claz18.pro4_enum;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2021-03-03 17:22
 *
 * 与常规抽象类一样，enum类允许我们为其定义抽象方法，然后使每个枚举实例都实现该方法，以便产生不同的行为方式，
 * 注意abstract关键字对于枚举类来说并不是必须的
 * 如下：
 *
 **/
public enum EnumDemo3 {

    MONDAY(1,"星期一"),
    TUESDAY(2,"星期二"),
    WEDNESDAY(3,"星期三"),
    THURSDAY(4,"星期四"),
    FRIDAY(5,"星期五"),
    SATURDAY(6,"星期六"),
    SUNDAY(7,"星期日");//记住要用分号结束

    private int code;//code
    private String desc;//中文描述

    /**
     * 私有构造,防止被外部调用
     * @param desc
     */
    private EnumDemo3(int code,String desc){
        this.code = code;
        this.desc=desc;
    }

    /**
     * 定义方法,返回描述,跟常规类的定义没区别
     * @return
     */
    public String getDesc(){
        return desc;
    }


    public int getCode() {
        return code;
    }

    public static String findName(int code){
        for (EnumDemo3 day:EnumDemo3.values()) {
            if(code == day.getCode()){
                return day.getDesc();
            }
        }
        return null;
    }
    public static void main(String[] args){

//        Enum types cannot be instantiated
//        new Day2("monday");

        //1
        for (EnumDemo3 day:EnumDemo3.values()) {
            System.out.println("name:"+day.name()+
                    ",desc:"+day.getDesc()+"code: "+day.getCode());
        }

        //2
        System.out.println("=============");
        System.out.println(EnumDemo3.findName(2));
    }
}
