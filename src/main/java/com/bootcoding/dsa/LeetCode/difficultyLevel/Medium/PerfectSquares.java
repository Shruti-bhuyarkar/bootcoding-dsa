package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

import java.util.Arrays;

public class PerfectSquares {
    public static void main(String[] args) {
        PerfectSquares solution = new PerfectSquares();
        int n = 12;
        int result = solution.numSquares(n);

        System.out.println("Least number of perfect square numbers for " + n + ": " + result);  // Output: 2 (4 + 4)
    }
    public int numSquares(int n) {
        // Create an array to store the least number of perfect square numbers for each value up to n
        int[] dp = new int[n + 1];

        // Initialize the array with maximum possible values
        Arrays.fill(dp, Integer.MAX_VALUE);

        // Base case: the least number of perfect square numbers for 0 is 0
        dp[0] = 0;

        // Iterate through values from 1 to n
        for (int i = 1; i <= n; i++) {
            // Try using each perfect square less than or equal to i
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }

        return dp[n];
    }


}

