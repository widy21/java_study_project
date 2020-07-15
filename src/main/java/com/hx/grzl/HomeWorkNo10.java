package com.hx.grzl;

import java.util.Scanner;

/**
 * 课后习题10、求1 + 2 + 3 +….+100
 **/
public class HomeWorkNo10 {
    public static void main(String[] args) {
        int sumNo = 0;
        for (int i = 1; i < 101; i++) {
            sumNo+=i;
        }
        System.out.println(sumNo);

    }
}
