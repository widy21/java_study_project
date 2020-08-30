package com.hx.grzl.class3;

import java.util.*;

/**
 * 习题4：使用while,计算随机数之和，超过100的时候，停止程序。
 * 随机数1-20的范围产生，要求记录一下产生的随机数，以及最后的和，以及随机数的个数。
 **/
public class ControlTest4 {

    public static void main(String[] args) {
        Random random = new Random();
        // 随机数个数
        int totalNum = 0;
        // 随机数和
        int sum = 0;
        // 随机数
        List<Integer> randomNums = new ArrayList<>();

        while (1==1){
            int x = random.nextInt(100);
            randomNums.add(x);
            totalNum++;
            sum+=x;
            if(sum>100){
                System.out.println(">100");
                break;
            }
        }

        System.out.println("totalNum="+totalNum);
        System.out.println("sum="+sum);
//        System.out.println("srandomNumsum="+ String.join(',',randomNums));

    }
}
