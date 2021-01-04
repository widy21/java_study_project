package com.hx.grzl.algorithm;

import java.util.Arrays;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2021-01-04 14:24
 **/
public class TestMatrix {

    public static void main(String[] args) {
        int n = 5;
        int totalNum = new Double(Math.pow(n,2)).intValue();
//        int totalNum = n*n;
        int[][] arr = new int[n][n];
        int right = 1, down=2, left=3, up=4;
        int direction = right;
        int r=0,c =0;
        for(int i=1;i<=totalNum;i++){
            //init value
            arr[r][c] = i;
            //check right
            if(direction == right){
                //
                if(c+1<n && arr[r][c+1] == 0){
                    c++;
                }else {
                    r++;
                    direction=down;
                    continue;
                }
            }

            //check down
            if(direction == down){
                if(r+1<n && arr[r+1][c] == 0){
                    r++;
                }else {
                    c--;
                    direction = left;
                    continue;
                }
            }

            //check left
            if(direction == left){
                if(c-1>=0 && arr[r][c-1] == 0){
                    c--;
                }else {
                    r--;
                    direction=up;
                    continue;
                }
            }

            //check up
            if(direction == up){
                if(r-1>=0 && arr[r-1][c] == 0){
                    r--;
                }else {
                    c++;
                    direction=right;
                    continue;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
