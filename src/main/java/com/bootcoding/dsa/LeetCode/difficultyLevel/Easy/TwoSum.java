package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

import java.util.HashMap;

public class TwoSum {
    static HashMap<Integer, Integer> Index = new HashMap<>();
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
      int[] ans =  twoSum(nums, 9);
       for(int i = 0; i < ans.length; i++){
           System.out.println(ans[i]);
       }
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (Index.containsKey(target - nums[i])) {
                return new int[] {Index.get(target - nums[i]), i};
            }
            Index.put(nums[i], i);
        }
        return new int[] {};
    }
}
