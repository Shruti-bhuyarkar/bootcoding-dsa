package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

public class MissingNumber {
    public static void main(String[] args) {
    int[] nums = {3, 0, 1};
    int ans = missingNumber(nums);
    for (int i = 0; i<nums.length; i++){
        System.out.println(ans);
     }
    }
    public static int missingNumber(int[] nums) {
        int total = 0;
        for(int num : nums){
            total += num;
        }
        return ((nums.length * (nums.length + 1) / 2) - total);
    }
}

