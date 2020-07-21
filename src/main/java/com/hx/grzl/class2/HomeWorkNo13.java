package com.hx.grzl.class2;

import java.util.Scanner;

/**
 * 课后习题13、一个足球队在寻找年龄在10到12岁的小女孩（包括10岁和12岁）加入。
 * 编写一个程序，询问用户的性别（m表示男性， f表示女性）和年龄，
 * 然后显示一条消息指出这个人是否可以加入球队，询问10次后，输出满足条件的总人数
 **/
public class HomeWorkNo13 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("please input the age: ");
            Scanner sc=new Scanner(System.in);
            String strAge=new String();
            strAge=sc.nextLine();
            int age = Integer.parseInt(strAge);


            System.out.println("please input the sex: m or f ?");
            Scanner sc1=new Scanner(System.in);
            String sex=new String();
            sex=sc1.nextLine();
            if(age >= 10 && age <= 12 && sex.equals("f")){
                count += 1;
                System.out.println("can join the game.");
            }else{
                System.out.println("can not join the game.");
            }
        }
        System.out.println("count="+count);

    }
}
