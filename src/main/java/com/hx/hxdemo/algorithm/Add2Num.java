package com.hx.hxdemo.algorithm;

/**
 * 大数相加
 * 链表实现
 */
public class Add2Num {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode current = root;
        int carray = 0;
        while (l1 != null || l2 != null) {
            int val1=0, val2 =0;
            if (l1!=null){
                val1 = l1.val;
                l1 = l1.next;
            }

            if (l2!=null){
                val2 = l2.val;
                l2 = l2.next;
            }

            int sum = val1 + val2 + carray;
            carray = sum / 10;
            sum = sum % 10;
            ListNode temp = new ListNode(sum);
            current.next = temp;
            current = current.next;

        }
        if (carray != 0) {
            ListNode temp = new ListNode(carray);
            current.next = temp;
        }

        return root.next;

    }

    public static void main(String[] args) {
//        [2,4,3]
//        [5,6,4]
        ListNode l1_v2 = new ListNode(2);
        ListNode l1_v4 = new ListNode(4);
        ListNode l1_v3 = new ListNode(3);
        l1_v2.next = l1_v4;
        l1_v4.next = l1_v3;

        ListNode l2_v5 = new ListNode(5);
        ListNode l2_v6 = new ListNode(6);
        ListNode l2_v4 = new ListNode(4);
        l2_v5.next = l2_v6;
        l2_v6.next = l2_v4;

        ListNode p = new Add2Num().addTwoNumbers(l1_v2, l2_v5);
        while (p != null) {
            System.out.println(p.val);
            p = p.next;
        }

//        String s = "abc";
//        System.out.println(s.value);
//        System.out.println(s.indexOf(""));

    }
}

