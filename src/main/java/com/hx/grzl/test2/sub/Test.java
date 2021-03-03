package com.hx.grzl.test2.sub;


public class Test {
    public static void main(String[] args) {
        Data data = new Data();
        data.name = "123";
        data.i = new Integer(200);
        change(data);

        System.out.println(data.name);
        System.out.println(data.i);

    }

    private static void change(Data data) {
        data.name = "hi";
        data.i = 20;
    }

}

class Data{
    String name;
    Integer i;
}