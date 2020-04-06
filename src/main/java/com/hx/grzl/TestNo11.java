package com.hx.grzl;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 习题11：找出s=”aabbccddxxxxffff”中，出现次数最多的字母
 * Created by huaxiao on 2020/4/6.
 */
public class TestNo11 {

    public static void main(String[] args) {
        String s = "aabbccddxxxxffff";
        System.out.println(s);

        Map<String, Integer> resultMap = new HashMap<>();

        //1.字符及其出现次数放入map
        char[] toCharArray = s.toCharArray();
        for (int i = 0; i < toCharArray.length; i++) {
            String key = String.valueOf(toCharArray[i]);
            Integer val = resultMap.get(key);
            if (val != null) {
                resultMap.put(key, ++val);
            } else {
                resultMap.put(key, 1);
            }
        }

        //2.查找出现次数最多的字母
        Integer maxTimes = Collections.max(resultMap.values());
        System.out.println("the maxTimes is: " + maxTimes);

        //3.查到最大出现次数对应的字母
        for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
            if (entry.getValue() == maxTimes) {
                System.out.println("the max character is: " + entry.getKey());
            }
        }
    }
}
