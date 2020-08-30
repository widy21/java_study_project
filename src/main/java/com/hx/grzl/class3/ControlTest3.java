package com.hx.grzl.class3;

import java.util.Random;
import java.util.Scanner;

/**
 * 习题3：随机生成一个整数，1-100之间你最多猜5次，如果猜大了，提示大了；
 * 如果小了，提示小了，猜对了，提示猜中。5次都没猜中，就猜没猜中。
 **/
public class ControlTest3 {

    public static void main(String[] args) {
        Random random = new Random();
        int min = 1;
        int max = 100;
        int x = random.nextInt(max - min + 1) + min;
        System.out.println(x);
        for (int i = 0; i < 5; i++) {
            System.out.println("input your guess num:");
            Scanner sc3 = new Scanner(System.in);
            String word = new String();
            word = sc3.nextLine();
            int inputNum = Integer.parseInt(word);
            if(inputNum == x){
                System.out.println(" guess right !");
            }else if(inputNum>x){
                System.out.println("guess bigger...");
            }else{
                System.out.println("guess smaller...");
            }
            if(i == 4){
                System.out.println("there is no chance, bye.");
            }
        }
    }
}
