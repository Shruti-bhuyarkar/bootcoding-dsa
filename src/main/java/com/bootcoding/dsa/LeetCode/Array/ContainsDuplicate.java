package com.bootcoding.dsa.LeetCode.Array;

import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        boolean T = containsDuplicate(nums);
        System.out.println(T);

    }
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0;i<nums.length-1;i++){
            if (nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
