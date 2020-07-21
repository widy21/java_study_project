package com.hx.grzl.class3;

import java.util.Scanner;

/**
 * 习题1：设定一个用户名和密码，用户输入正确的用户名和密码，则显示登录成功，
 * 否则提示登录失败，用户最多失败3次，否则退出程序。
 **/
public class ControlTest1 {


    public static void main(String[] args) {
        String userName = "hhq";
        String pwd = "123";

        for (int i = 0; i < 3; i++) {
            System.out.println("input user name:");
            Scanner sc3 = new Scanner(System.in);
            String inputUserName = new String();
            inputUserName = sc3.nextLine();

            System.out.println("input password:");
            Scanner sc = new Scanner(System.in);
            String inputPwd = new String();
            inputPwd = sc.nextLine();

            if(inputUserName.equals(userName) && inputPwd.equals(pwd)){
                System.out.println("guess ok.");
                break;
            }else {
                System.out.println("guess error.");
            }
        }
        System.out.println("input times is used out! bye!!");
    }
}
