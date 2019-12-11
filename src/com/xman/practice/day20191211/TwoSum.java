package com.xman.practice.day20191211;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 */
public class TwoSum {


    public int[] twoSum(int[] nums, int target) {
        if (nums.length < 2) return new int[]{-1};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int componet = target - nums[i];
            if (map.containsKey(componet) && map.get(componet) != i) {
                return new int[]{i, map.get(componet)};
            }
            map.put(nums[i], i);
        }

        return new int[]{-1};
    }
}
