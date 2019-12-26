package com.hx.hxdemo.algorithm;

/**
 * @program: hx-demo
 * @description: 二分查找
 * @author: huaxiao
 * @create: 2019-12-26 15:14
 *
 *
 * arr: [1,2,3,4,5]
 *
 * key: 3
 * l=0,h=4
 * loop1:
 *  m=0+(4-0)/2=2
 *  arr[m] = arr[2] = 3
 *  return 3
 *
 * key: 2
 * l=0,h=4
 * loop1:
 *  m=0+(4-0)/2=2
 *  arr[m] = arr[2] = 3
 *  3>key(2)
 *  h = m-1 => h=2-1 => h=1
 *
 * loop2:
 *  m=l+(h-l)/2 => m=0+(1-0)/2 => m=0
 *  arr[m] = arr[0] = 1
 *  1<key(2)
 *  l=m+1 = 0+1 = 1
 *
 * loop3:
 *  m=l+(h-l)/2 => m=1+(1-1)/2 => m=1
 *  arr[m] = arr[1] = 2
 *  arr[m]=key
 *  return 1
 *
 **/
public class BinarySearch {

    /**
     * 自己的实现
     * @param arr
     * @param key
     * @return
     */
    private int getIndex(int[] arr, int key) {
        int len = arr.length;
        int l = 0, h = len-1;
        while (l <= h) {
            int m = l+(h-l)/2;
            if(arr[m] == key){
                return m;
            }else if(arr[m]>key){
                h = m-1;
            }else {
                l = m+1;
            }
        }
        return -1;
    }

    /**
     * git上的实现
     * @param nums
     * @param key
     * @return
     */
    public int binarySearch(int[] nums, int key) {
        int l = 0, h = nums.length - 1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (nums[m] == key) {
                return m;
            } else if (nums[m] > key) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int key = 2;
        System.out.println(new BinarySearch().getIndex(arr, key));

    }
}
