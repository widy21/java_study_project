package com.hx.hxdemo.algorithm;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

/**
 * 最大子序列和
 * todo -- 运行结果不对
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
                List tempResult = Lists.newArrayList();
                sum+=args[j];
                if(sum>max){
                    max=sum;
                    tempResult.add(args[j]);
//                    ret = null;
//                    ret = Arrays.copyOfRange(args,i,args.length-1);
                }
                result = tempResult;
//                tempResult = null;
            }
        }
        System.out.println(String.format("max num is: %s",max+""));
        System.out.println("resultList is :"+String.join(",",result));
        for (int i = 0; i < result.size(); i++) {
            ret[i] = Integer.parseInt((String) result.get(i));

        }
        return ret;
    }

    public static void main(String[] args) {
        int[] arr = {-1,1,2,-2,6};
        int[] ret = new MaxSeq().getMaxSumSequenceOn2(arr);
        System.out.println(Arrays.toString(ret));
    }
}
