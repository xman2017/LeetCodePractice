package com.xman.practice.day20191211;

/**
 * 二分查找
 */
public class BinarySearch {

    public int search(int[] nums, int target) {
        if (nums.length <= 0) return -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
