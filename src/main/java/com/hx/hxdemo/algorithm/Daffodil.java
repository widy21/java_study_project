package com.hx.hxdemo.algorithm;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
 * 例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
 * 1.程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
 *
 * @author huaxiao
 */
public class Daffodil {
    /**
     * 将一个三位数分解为三个数字，并计算立方和
     * 如：153 分解为1、5、3
     *
     * @param num
     * @return
     */
    public static long getCubeSum(long num) {
        List singleNumList = Lists.newArrayList();
        while (num!= 0) {
            long lastNum = num % 10;
//            System.out.println(String.format("lastNum is: %s", lastNum));
            singleNumList.add(lastNum+"");
//            System.out.println(String.format("num is: %s", num));
            num = num / 10;
        }
        List reverseList = Lists.reverse(singleNumList);
//        System.out.println(String.format("the resule list is: %s", String.join(",", reverseList)));
        long resultNum = (long) Math.pow(Long.parseLong(reverseList.get(0) + ""), 3)
                + (long) Math.pow(Long.parseLong(reverseList.get(1) + ""), 3)
                + (long) Math.pow(Long.parseLong(reverseList.get(2) + ""), 3);
        return resultNum;
    }

    public static void main(String[] args) {
        for(long i=100;i<999;i++){
            if(Daffodil.getCubeSum(i)==i){
                System.out.println("the daffodil is: "+i);
            }
        }
    }
}
