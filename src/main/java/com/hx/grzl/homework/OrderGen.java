package com.hx.grzl.homework;

/**
 * @program: ethan
 * @description:
 * 2、定义一个订单类，包含订单价格、创建时间、支付时间属性；包含打印订单信息、创建订单、支付订单、删除订单方法。
 *  通过匿名对象的方式调用三个方法。
 *  新建订单生成类，定义生成订单方法，通过订单类匿名对象的方式调用此方法，并在方法中打印订单信息
 * @author: huaxiao
 * @create: 2021-01-11 16:18
 **/
public class OrderGen {
    public static void main(String[] args) {
        //通过匿名对象的方式调用三个方法。
        new Order().printOrderInfo();
        new Order().payOrder();
        new Order().delOrder();

        System.out.println("========================");
        //通过OrderGen匿名对象，调用 generateOrder 方法， 订单类匿名对象作为实参
        new OrderGen().generateOrder(new Order());
    }

    public void generateOrder(Order order){
        order.orderPrice = 1999.0;
        order.craeteTime = "2021-01-11 16:32:00";
        order.payTime = "2021-01-11 16:52:00";
        //方法中调用方法
        order.printOrderInfo();
    }
}


class Order{
    public double orderPrice;
    public String craeteTime;
    public String payTime;

    public void printOrderInfo(){
        System.out.println(String.format(
                "订单价格：%.2f；订单创建时间：%s；订单支付时间：%s",
                orderPrice, craeteTime, payTime
        ));
    }

    public void payOrder(){
        System.out.println("支付订单中...");
    }

    public void delOrder(){
        System.out.println("删除订单中...");
    }
}