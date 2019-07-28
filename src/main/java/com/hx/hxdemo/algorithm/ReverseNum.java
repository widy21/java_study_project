package com.hx.hxdemo.algorithm;


import com.google.common.collect.Lists;

import java.util.List;

//数字反转
public class ReverseNum {

    public static void main(String[] args) {
        int num = 45678;

        List resultList = Lists.newArrayList();
        int result = 0;
        while( num !=0){
            int remainder = num%10;//取余，结果为反转后的最左边数字
            System.out.println("mod = "+remainder);
            resultList.add(remainder+"");
            num = num/10;//当前数字
            result = result*10+remainder;
        }
        System.out.println("result = "+result);
        System.out.println(String.format("after reverse, the result is : %s",String.join("",resultList) ));
    }

}
