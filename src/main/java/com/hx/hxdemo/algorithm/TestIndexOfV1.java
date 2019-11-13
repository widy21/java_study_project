package com.hx.hxdemo.algorithm;

public class TestIndexOfV1 {
    //abcdadcdefg
    //    def
    public int indexOf1(String source, String sub) {
        int retPos = 0;
        char[] sourceArr = source.toCharArray();
        char[] subArr = sub.toCharArray();
        for (int i = 0; i < sourceArr.length; i++) {
            if (sourceArr[i] == subArr[0]) {
                int self = i;
                int j = 0;
                while (j < subArr.length) {
                    if (sourceArr[self] != subArr[j]) {
                        retPos = -1;
                        break;
                    } else {
                        retPos = i;
                    }
                    self++;
                    j++;
                }

            }
        }
        return retPos;
    }

    public static void main(String[] args) {
        TestIndexOfV1 testIndexOfV1 = new TestIndexOfV1();
        int index1 = testIndexOfV1.indexOf1("abcdadcdefg", "def");
        int index2 = testIndexOfV1.indexOf1("woshishui", "shi");
        System.out.println("index1="+index1);
        System.out.println("index2="+index2);
    }

}
