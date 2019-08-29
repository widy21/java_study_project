package com.hx.hxdemo.algorithm;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

/**
 * 最大子序列和
 */
public class MaxSeq {

    public int[] getMaxSumSequenceOn2(int[] args){
        List result = Lists.newArrayList();
        int[] ret = null;
        int max = 0;
        // -1,1,2,-2
        for(int i=0;i<args.length;i++){
            int sum=0;
//            result.add(Arrays.copyOfRange(args,i,args.length));

            for(int j=i;j< args.length;j++){
                sum+=args[j];
                if(sum>max){
                    max=sum;
//                    ret = null;
                    ret = Arrays.copyOfRange(args,i,args.length-1);
                }
            }
        }
        System.out.println(String.format("max num is: %s",max+""));
        return ret;
    }

    public static void main(String[] args) {
        int[] arr = {-1,1,2,-2};
        int[] ret = new MaxSeq().getMaxSumSequenceOn2(arr);
        System.out.println(Arrays.toString(ret));
    }
}
