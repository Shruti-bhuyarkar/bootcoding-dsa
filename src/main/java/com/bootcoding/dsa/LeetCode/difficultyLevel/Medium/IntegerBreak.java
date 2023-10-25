package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

public class IntegerBreak {

    public static void main(String[] args) {
        int n = 10; // You can change the value of n as needed.
        int maxProduct = integerBreak(n);
        System.out.println("Maximum Product for n = " + n + " is: " + maxProduct);
    }
    public static int integerBreak(int n) {
        if (n <= 3) {
            return n - 1;
        }
        int[] dp = new int[n + 1];
        dp[2] = 2;
        dp[3] = 3;
        for (int i = 4; i <= n; i++) {
            dp[i] = Math.max(2 * dp[i - 2], 3 * dp[i - 3]);
        }
        return dp[n];
    }
}

