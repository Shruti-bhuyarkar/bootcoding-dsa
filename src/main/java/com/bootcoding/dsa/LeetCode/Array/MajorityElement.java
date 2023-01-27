package com.bootcoding.dsa.LeetCode.Array;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
      //  int n = nums.length;
        System.out.println(majorityElement(nums) );
    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            index.put(nums[i], index.getOrDefault(nums[i], 0) + 1);
        }
        for (int n : index.keySet()) {
            if (index.get(n) > nums.length / 2) {
                return n;
            }
        }
        return -1;

    }
}
