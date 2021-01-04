package com.hx.grzl.normalclass.claz2;

import java.util.Scanner;

/**
 * 从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
 * 成绩>=最高分-10    等级为’A’
 * 成绩>=最高分-20    等级为’B’
 * 成绩>=最高分-30    等级为’C’
 * 其余                            等级为’D’
 * <p>
 * 提示：先读入学生人数，根据人数创建int数组，存放学生成绩。
 * <p>
 * TDD
 */
public class Practice1 {



    private static void calGrade() {
        //1、使用Scanner，读取学生个数
        final Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生的个数：");
        final int stuNum = scanner.nextInt();

        if (stuNum > 0) {
            System.out.println("待操作的学生人数为：" + stuNum);
        } else {
            System.out.println("参数非法");
            System.exit(-1);
        }

        //2、创建数组，存储学生的成绩；动态初始化
        int[] scoreArr = new int[stuNum];

        //3、动态初始化赋值
        System.out.println("请输入" + stuNum + "个学生的成绩");
        for (int i = 0; i < scoreArr.length; i++) {
            scoreArr[i] = scanner.nextInt();
        }

        //4、获取最大值（最高成绩）
        int maxScore = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            if (scoreArr[i] > maxScore) {
                maxScore = scoreArr[i];
            }
        }
        System.out.println("最大分数为：" + maxScore);

        //5、根据每个学生成绩和最高分的差值，得到每个学生的等级并输出到控制台
        char level;
        for (int i = 0; i < scoreArr.length; i++) {
            int currentScore = scoreArr[i];
            if (maxScore - currentScore <= 10) {
                level = 'A';
            } else if (maxScore - currentScore <= 20) {
                level = 'B';
            } else if (maxScore - currentScore <= 30) {
                level = 'C';
            } else {
                level = 'D';
            }
            System.out.printf("student %d, score：%d, grade is %c \n", i, currentScore, level);
        }
    }

    public static void main(String[] args) {
//        calGrade();
//        char level = "A".charAt(0);
//        System.out.println((int)level);

        char level;
        if(true){
            level = 'A';
        }
        System.out.println(level);
    }
}
