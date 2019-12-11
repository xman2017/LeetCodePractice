package com.xman.practice;

import com.xman.practice.day20191211.KthLargest;
import com.xman.practice.day20191211.TwoSum;

public class MainApplication {

    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = -1;
        nums[1] = 3;
        nums[2] = 1;
        TwoSum twoSum = new TwoSum();
        int[] ints = twoSum.twoSum(nums, 0);
        printNums(ints);

        KthLargest kthLargest = new KthLargest(2, nums);
        printVal(kthLargest.add(10));
        printVal(kthLargest.add(1));
        printVal(kthLargest.add(5));
        printVal(kthLargest.add(6));
    }

    public static void printNums(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void printVal(int val) {
        System.out.println(val);
    }
}
