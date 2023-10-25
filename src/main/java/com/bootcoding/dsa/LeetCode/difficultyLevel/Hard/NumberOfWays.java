package com.bootcoding.dsa.LeetCode.difficultyLevel.Hard;

public class NumberOfWays {
    public static void main(String[] args) {
        NumberOfWays numberOfWays = new NumberOfWays();
        int steps = 3; // You can change the values as needed
        int arrLen = 2; // You can change the values as needed

        int result = numberOfWays.numWays(steps, arrLen);
        System.out.println("Number of Ways: " + result);
    }
        public int numWays(int steps, int arrLen) {
            int m = steps;
            int n = Math.min(steps / 2 + 1, arrLen);

            int[][] dp = new int[m + 1][n];
            dp[0][0] = 1;

            int mod = 1000000007;

            for (int i = 1; i <= m; i++) {
                for (int j = 0; j < n; j++) {
                    dp[i][j] = dp[i - 1][j];
                    if (j > 0) {
                        dp[i][j] = (dp[i][j] + dp[i - 1][j - 1]) % mod;
                    }
                    if (j < n - 1) {
                        dp[i][j] = (dp[i][j] + dp[i - 1][j + 1]) % mod;
                    }
                }
            }

            return dp[m][0];
        }


    }
