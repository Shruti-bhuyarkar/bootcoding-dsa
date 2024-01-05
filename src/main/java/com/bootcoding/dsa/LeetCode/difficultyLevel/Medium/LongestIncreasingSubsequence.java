package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {
        LongestIncreasingSubsequence solution = new LongestIncreasingSubsequence();

        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        int result = solution.lengthOfLIS(nums);
        System.out.println("Length of Longest Increasing Subsequence: " + result);
    }
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] dp = new int[n];

        // Initialize the dp array with 1 (each element is a subsequence of length 1)
        Arrays.fill(dp, 1);

        // Iterate through the array to update the dp values
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        // Find the maximum value in the dp array
        int maxLength = 0;
        for (int len : dp) {
            maxLength = Math.max(maxLength, len);
        }

        return maxLength;
    }

}
