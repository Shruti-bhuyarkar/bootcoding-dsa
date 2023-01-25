package com.bootcoding.dsa.LeetCode.Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println(twoSum(nums, 9));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> Index = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (Index.containsKey(target - nums[i])) {
                return new int[] {Index.get(target - nums[i]), i};
            }
            Index.put(nums[i], i);
        }
        return new int[] {};
    }

}
