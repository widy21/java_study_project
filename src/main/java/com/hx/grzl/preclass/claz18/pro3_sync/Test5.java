package com.hx.grzl.preclass.claz18.pro3_sync;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2021-03-03 11:24
 **/
public class Test5 {
    // 注意value是静态的成员变量
    static int value = 9;

    public static void main(String[] args) throws Exception {
        new Test5().printValue();
    }

    private void printValue() {
        int value = 69;
        System.out.println(this.value);
    }
}
