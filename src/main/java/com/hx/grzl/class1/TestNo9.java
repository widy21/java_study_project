package com.hx.grzl.class1;

import java.util.ArrayList;
import java.util.List;

/**
 * 习题9、一个list包含10个数字，然后生成新的list，要求，
 * 新的list里面的数都比之前的数多1
 * Created by huaxiao on 2020/4/6.
 */
public class TestNo9 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(i);
        }
        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>();
        for (Integer num : list1) {
            list2.add(num+1);
        }
        System.out.println(list2);

    }

}
