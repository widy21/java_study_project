package com.hx.grzl.class3;

import java.util.Scanner;

/**
 * 习题10：用户输入多个数字，当输入偶数的时候求和，输入奇数，不求和，输入.
 * （一个点）的时候结束求和，打印求和结果
 **/
public class ControlTest10 {

    public static void main(String[] args) {
        int count = 0;
        while (true){

            Scanner input = new Scanner(System.in);
            System.out.println("请输入：");
            String line = input.nextLine();
            System.out.println("输入的内容是：" + line);

            if(line != null && line.equals(".")){
                System.out.println("count="+count);
                break;
            }
            int i = Integer.parseInt(line);
            //偶数求和，奇数不求和。
            if(i%2==0){
                count+=i;
            }
        }
    }
}
