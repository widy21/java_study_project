package com.hx.grzl.preclass.claz20.homework.pro1;

import java.util.Random;

/**
 1.	定义一个电脑品牌枚举类，其中只有固定的几个电脑品牌。
 定义一个取货方法getComputer随机获取一个品牌电脑，并打印这个电脑的品牌
 **/
public enum  Brand {
    Lenovo,Dell,Accer,ASUS;

    public static Brand getComputer(int i){
        for (Brand brand : Brand.values()) {
           if(brand.ordinal() == i){
               return brand;
           }
        }
        return null;
    }
}


class getComputer{
    public static void main(String[] args) {
//        for (Brand brand3 : Brand.values()) {
//            System.out.println(brand3);
//            System.out.println(brand3.ordinal());
//        }


        for (int i = 0; i < 5; i++) {
            System.out.println(String.format("the %d time...", i));
            int random = new Random().nextInt(4);
            System.out.println("random="+random);
            System.out.println("Brand="+Brand.getComputer(random));
            System.out.println("------------");
        }
    }
}

