package com.bootcoding.dsa.LeetCode.difficultyLevel.Hard;

public class KInversePairs {
    public static void main(String[] args) {
        KInversePairs solution = new KInversePairs();
        int n = 3, k = 1;
        int result = solution.kInversePairs(n, k);
        System.out.println("Number of arrays with exactly " + k + " inverse pairs: " + result);
    }
    private static final int MOD = 1000000007;

    public int kInversePairs(int n, int k) {
        int[][] dp = new int[n + 1][k + 1];

        // Base case: There is only one array of length 0 with 0 inverse pairs
        dp[0][0] = 1;

        // Iterate over the length of the array
        for (int i = 1; i <= n; i++) {
            // Iterate over the number of inverse pairs
            for (int j = 0; j <= k; j++) {
                // Calculate dp[i][j] using the recurrence relation
                for (int p = 0; p <= Math.min(j, i - 1); p++) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - p]) % MOD;
                }
            }
        }

        return dp[n][k];
    }


}

