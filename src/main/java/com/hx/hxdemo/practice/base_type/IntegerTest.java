package com.hx.hxdemo.practice.base_type;

public class IntegerTest {
    public static void main(String[] args) {
        Integer i1 = 40;

        Integer i2 = 40;

        Integer i3 = 0;

        Integer i4 = new Integer(40);

        Integer i5 = new Integer(40);

        Integer i6 = new Integer(0);

        //add
        Integer i7 = 660;
        Integer i8 = 660;

        int i9 = 660;
        int i10 = 660;


        System.out.println("i1=i2   " + (i1 == i2));
        System.out.println("i7=i8   " + (i7 == i8));//超出缓存范围，需要new Integer()创建对象，对象比较为地址比较，所以为false。
        System.out.println("i9=i10   " + (i9 == i10));

        System.out.println("i1=i2+i3   " + (i1 == i2 + i3));

        System.out.println("i1=i4   " + (i1 == i4));

        System.out.println("i4=i5   " + (i4 == i5));

        System.out.println("i4=i5+i6   " + (i4 == i5 + i6));
        System.out.println("i4=40   " + (i4 == 40));

        System.out.println("40=i5+i6   " + (40 == i5 + i6));

        System.out.println(Long.parseLong("2535360000"));
        System.out.println(Long.MAX_VALUE);
    }
}
