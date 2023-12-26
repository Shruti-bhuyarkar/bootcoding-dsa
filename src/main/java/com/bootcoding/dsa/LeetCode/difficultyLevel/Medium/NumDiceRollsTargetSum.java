package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

public class NumDiceRollsTargetSum {

    public static void main(String[] args) {
        NumDiceRollsTargetSum solution = new NumDiceRollsTargetSum();
        int n = 2;
        int k = 6;
        int target = 7;

        int result = solution.numRollsToTarget(n, k, target);
        System.out.println("Number of ways to roll the dice: " + result);
    }
    public int numRollsToTarget(int n, int k, int target) {
        int MOD = 1000000007;
        int[][] dp = new int[n + 1][target + 1];

        // Base case: there is one way to achieve a sum of 0 with 0 dice
        dp[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                for (int face = 1; face <= k; face++) {
                    if (j >= face) {
                        dp[i][j] = (dp[i][j] + dp[i - 1][j - face]) % MOD;
                    }
                }
            }
        }

        return dp[n][target];
    }

}

