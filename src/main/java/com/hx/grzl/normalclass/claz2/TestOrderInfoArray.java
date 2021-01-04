package com.hx.grzl.normalclass.claz2;

/**
 * 测试订单列表页信息的生成。
 * <p>
 * 商品名称、商品明细、商品价格
 */
public class TestOrderInfoArray {

    public static void main(String[] args) {

//        1.定义并初始化存储商品名称、商品明细、商品价格的数组
        String[] goodsNameArr = new String[3];
        String[] goodsNameDetailArr = new String[3];
        Double[] goodsPriceArr = new Double[3];

        goodsNameArr[0] = "牙刷";
        goodsNameArr[1] = "牙膏";
        goodsNameArr[2] = "洗发水";

        goodsNameDetailArr[0] = "海飞丝牙刷";
        goodsNameDetailArr[1] = "舒适达牙膏";
        goodsNameDetailArr[2] = "海飞丝洗发水";

        goodsPriceArr[0] = 10.26;
        goodsPriceArr[1] = 20.5;
        goodsPriceArr[2] = 50d;

//        2.遍历三个数组，打印结果
        System.out.println("orderNo: 2020122013500001");
        System.out.println("=======================");
        Double totalPrice = 0.0d;
        for (int i = 0; i < goodsNameArr.length; i++) {
            String goodsName = goodsNameArr[i];
            String goodsNameDetail = goodsNameDetailArr[i];
            Double goodsPrice = goodsPriceArr[i];
            totalPrice += goodsPrice;
            System.out.println("商品名称：" + goodsName);
            System.out.println("\t商品明细：" + goodsNameDetail);
            System.out.println("\t\t商品价格：" + goodsPrice);
            if (i == goodsNameArr.length - 1) {
                System.out.println("=======================");
            } else {
                System.out.println("--------------------------");
            }
        }
        System.out.println("\t\t\t商品总价：" + totalPrice);
    }
}
