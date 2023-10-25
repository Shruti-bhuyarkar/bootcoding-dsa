package com.bootcoding.dsa.LeetCode.difficultyLevel.Hard;

import java.util.Arrays;

public class MaxDotProduct {
    public static void main(String[] args) {
        int[] nums1 = {2, 1, -2, 5};
        int[] nums2 = {3, 0, -6};

        MaxDotProduct solution = new MaxDotProduct();
        int result = solution.maxDotProduct(nums1, nums2);

        System.out.println("Maximum Dot Product: " + result);
    }

    public int maxDotProduct(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++)
            Arrays.fill(dp[i], Integer.MIN_VALUE);
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                dp[i + 1][j + 1] = Math.max(Math.max(dp[i][j + 1], dp[i + 1][j]),
                        Math.max(0, dp[i][j]) + nums1[i] * nums2[j]);
        return dp[m][n];
    }
}

