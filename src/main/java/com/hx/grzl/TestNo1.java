package com.hx.grzl;

import org.apache.logging.log4j.util.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by huaxiao on 2020/3/20.
 * 习题1：一个列表，排重，不能用set，也不能用字典
 * <p>
 * 1 生成一个空列表result，存储排重后的元素
 * 2 遍历列表的每一个元素，判断是否在result列表里面，如果不在，就添加到result列表中
 * 3 如果在，则不做任何动作
 * 4 最后打印result列表
 * <p>
 * l = [1,2,1,2,1,2,3,3]
 * result = []
 * <p>
 * for i in l:
 * if i not in result:
 * result.append(i)
 * print(result)
 */
public class TestNo1 {
    public static void main(String[] args) {
        List<Integer> inputParam = Arrays.asList(1, 2, 1, 2, 1, 2, 3, 3);
        List<String> result = new ArrayList<>();
        for (Integer i : inputParam) {
            String tempObj = i + "";
            if (!result.contains(tempObj)) {
                result.add(tempObj);
            }
        }
        System.out.println(String.join(",", result));
    }
}
