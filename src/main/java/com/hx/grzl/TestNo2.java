package com.hx.grzl;

/**
 * Created by huaxiao on 2020/3/29.
 * 习题2：输出大写字母、小写字母、大小写字母、数字、大小写字母和数字
 * <p>
 * >>> lower = ""
 * >>> for i in range(97,123):
 * ...     lower += chr(i)
 * ...
 * >>> print(lower)
 * Abcdefghijklmnopqrstuvwxy
 * <p>
 * <p>
 * >>> upper = ""
 * >>> for i in range(65,91):
 * ...     upper += chr(i)
 * ...
 * >>> print(upper)
 */
public class TestNo2 {
    public static void main(String[] args) {
        /*for(int i=0;i<26;i++) {
            System.out.print((char)('A'+i)+" ");
        }
        System.out.println("\n============");
        for(int i=0;i<26;i++) {
            System.out.print((char)('a'+i)+" ");
        }
        System.out.println("\n============");*/

        String lower = "";
        String uper = "";
        String digits = "";
        for (int i = 97; i < 123; i++) {
            lower += (char) (i);
        }
        System.out.print(lower);
        System.out.println("\n============");

        for (int i = 65; i < 91; i++) {
            uper += (char) (i);
        }
        System.out.print(uper);
        System.out.println("\n============");

        for (int i = 48; i < 58; i++) {
            digits += (char) (i);
        }
        System.out.print(digits);
        System.out.println("\n============");

        System.out.print(lower + uper + digits);

    }
}