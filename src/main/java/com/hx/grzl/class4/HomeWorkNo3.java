package com.hx.grzl.class4;

/**
 * 2.	成绩等级判断 利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示， 60-89分之间的用B表示，60分以下的用C表示
 **/
public class HomeWorkNo3 {


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
