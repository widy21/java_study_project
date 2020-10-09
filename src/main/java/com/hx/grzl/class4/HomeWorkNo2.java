package com.hx.grzl.class4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 3.	实现数学中多项式求和公式的打印 比如：a6x^6 + a5x^5 + a4x^4 + a3x^3 + a2x^2 + a1x^1 + a0
 **/
public class HomeWorkNo2 {


    public static void main(String[] args){
        int n = 70;
        grade(n);
    }
    //成绩等级计算
    private static void grade(int n){
        if(n>100 || n<0)
            System.out.println("输入无效");
        else{
            String str = (n>=90)?"分，属于A等":((n>60)?"分，属于B等":"分，属于C等");
            System.out.println(n+str);
        }
    }
}
