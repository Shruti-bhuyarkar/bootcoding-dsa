package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

public class MinimumIncrementOperationsMakeArrayBeautiful {
    public static void main(String[] args) {
        MinimumIncrementOperationsMakeArrayBeautiful minimumIncrementOperationsMakeArrayBeautiful = new MinimumIncrementOperationsMakeArrayBeautiful();

        // Test the minIncrementOperations method
        int[] nums = {3, 2, 1, 1, 2, 3};
        int k = 3;
        long result = minimumIncrementOperationsMakeArrayBeautiful.minIncrementOperations(nums, k);
        System.out.println("Minimum increment operations needed: " + result);
    }
        public long minIncrementOperations(int[] nums, int k) {
            long dp1 = 0, dp2 = 0, dp3 = 0, dp;
            for (int a : nums) {
                dp = Math.min(dp1, Math.min(dp2, dp3)) + Math.max(k - a, 0);
                dp1 = dp2;
                dp2 = dp3;
                dp3 = dp;
            }
            return Math.min(dp1, Math.min(dp2, dp3));
        }


    }


