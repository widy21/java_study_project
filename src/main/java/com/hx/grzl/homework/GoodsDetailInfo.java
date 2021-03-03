package com.hx.grzl.homework;

/**
 * 定义商品详情类 GoodsDetailInfo，
 * 包含商品名称、商品价格、商品配置信息、商品评价信息四个属性；
 * 重载3个构造方法和一个构造语句块。
 * 构造器中抽象出查询评价信息的逻辑，语句块中抽象出查询配置信息的逻辑。
 * 编写测试类进行测试。
 */
public class GoodsDetailInfo {

    private String name;
    private double price;
    private GoodsConfig goodsConfig;
    private GoodsEvaluation goodsEvaluation;

    {
        goodsConfig = new GoodsConfig(16,256);
    }

    public GoodsDetailInfo() {
        goodsEvaluation = new GoodsEvaluation("2021年02月03日13:18:06", "Ethan", "刚到手就坏了。");
    }

    public GoodsDetailInfo(String name) {
        this();
        this.name = name;
    }

    public GoodsDetailInfo(String name, double price, GoodsConfig goodsConfig, GoodsEvaluation goodsEvaluation) {
        this();
        this.name = name;
        this.price = price;
        this.goodsConfig = goodsConfig;
        this.goodsEvaluation = goodsEvaluation;
    }

    public GoodsDetailInfo(double price) {
        this.price = price;
    }



    public GoodsConfig getGoodsConfig() {
        return goodsConfig;
    }

    public GoodsEvaluation getGoodsEvaluation() {
        return goodsEvaluation;
    }

    @Override
    public String toString() {
        return "商品信息{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", goodsConfig=" + goodsConfig +
                ", goodsEvaluation=" + goodsEvaluation +
                '}';
    }

    public static void main(String[] args) {
        GoodsDetailInfo goodsDetailInfo = new GoodsDetailInfo();
        System.out.println(goodsDetailInfo.getGoodsConfig());
        System.out.println(goodsDetailInfo.getGoodsEvaluation());

        System.out.println("==============================");

        GoodsDetailInfo goodsDetailInfo1 = new GoodsDetailInfo("商品xxx");
        System.out.println(goodsDetailInfo1);
        System.out.println(goodsDetailInfo1.getGoodsConfig());
        System.out.println(goodsDetailInfo1.getGoodsEvaluation());
    }



}


class GoodsConfig{
    private int ram;
    private int disk;

    public GoodsConfig(int ram, int disk) {
        this.ram = ram;
        this.disk = disk;
    }

    @Override
    public String toString() {
        return "商品配置{" +
                "ram=" + ram +
                "G, disk=" + disk +
                "G}";
    }
}

class GoodsEvaluation{
    private String createTime;
    private String userName;
    private String content;

    public GoodsEvaluation(String createTime, String userName, String content) {
        this.createTime = createTime;
        this.userName = userName;
        this.content = content;
    }

    @Override
    public String toString() {
        return "商品评价{" +
                "createTime='" + createTime + '\'' +
                ", userName='" + userName + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}