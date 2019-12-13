package com.xman.practice.day20191213;

import java.util.*;

/**
 * @Author: xman
 * @CreateDate: 2019/12/13 11:18
 * @Description: 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * 满足要求的三元组集合为：
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) return new ArrayList<>();
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> targetList;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            if (i == 0 || nums[i] > nums[i - 1]) {
                while (l < r) {
                    int sum = nums[i] + nums[l] + nums[r];
                    if (sum == 0) {
                        targetList = new ArrayList<>();
                        targetList.addAll(Arrays.asList(nums[i], nums[l], nums[r]));
                        resultList.add(targetList);
                        l++;
                        r--;
                        while (l < r && nums[l] == nums[l - 1]) {
                            l++;
                        }
                        while (l < r && nums[r] == nums[r + 1]) {
                            r--;
                        }
                    } else if (sum < 0) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }

        }

        return resultList;
    }
}
