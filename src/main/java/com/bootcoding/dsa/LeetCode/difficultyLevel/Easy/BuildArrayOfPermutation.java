package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

public class BuildArrayOfPermutation {
    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};
        int[] ans = buildArray(nums);
        for(int n : ans)
            System.out.print(n + " ");
    }
    public static int[] buildArray(int[] nums) {
        int[] n = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            n[i] = nums[nums[i]];
        }
        return n;
    }
}
