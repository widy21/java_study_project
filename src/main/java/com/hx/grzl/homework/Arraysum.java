package com.hx.grzl.homework;
import java.util.Scanner;

public class Arraysum {
    public static int max=0;//最大值
    public static int min=0;//最小值
    public static int sum;
    public static int [] arrays;//一纬数组

    /**
     *
     1.从键盘输入一维数组长度和数字元素，求数组元素的最大值、最小值、总和。
     */
    public static void main(String [] args){
        //从键盘输入一纬数组长度和数字元素
        Scanner sc= new Scanner(System.in);
        System.out.println("请指定要操作数组的长度");
        int arrayLength=sc.nextInt();//指定了数组的元素
        //定义数组长度
        arrays=new int [arrayLength];
        //要输入的数组长度
        System.out.println("请输入长度为"+arrayLength+"的数组元素");
        //内外嵌套for循环初始化数组
        for(int i=0;i<arrays.length;i++){
            //遍历的每一个值都从键盘获取
            arrays[i]=sc.nextInt();
        }

        min = arrays[0];

//        //求出数据最大值,最小值
        for(int i=0;i<arrays.length;i++){
            //求出元素中的总和
            sum+=arrays[i];
            //三目运算符求出最大值
            max=arrays[i]>max?arrays[i]:max;
            //三目运算符求出最小值
            min=min<arrays[i]?min:arrays[i];

            /*for(int j=0;j<arrays.length;j++){
                //三目运算符求出最小值
                min=arrays[j]<arrays[i]?arrays[j]:arrays[i];
                break;
            }*/

        }
        System.out.println("数组中最大值是"+max);
        System.out.println("数组中最小值是"+min);
        System.out.println("数组中总和是"+sum);





    }
}
