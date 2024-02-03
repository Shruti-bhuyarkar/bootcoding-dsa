package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

public class PartitionArrayForMaximumSum {
    public static void main(String[] args) {
        PartitionArrayForMaximumSum solution = new PartitionArrayForMaximumSum();
        int[] arr = {1, 15, 7, 9, 2, 5, 10};
        int k = 3;
        int result = solution.maxSumAfterPartitioning(arr, k);

        System.out.println("Result: " + result);  // Output: 84
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            int maxVal = 0;
            for (int j = 1; j <= k && i - j >= 0; j++) {
                maxVal = Math.max(maxVal, arr[i - j]);
                dp[i] = Math.max(dp[i], dp[i - j] + maxVal * j);
            }
        }

        return dp[n];
    }


}

