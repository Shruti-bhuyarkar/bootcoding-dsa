package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

public class MinimumFallingPathSum {
    public static void main(String[] args) {

        int[][] matrix = {
                {2, 1, 3},
                {6, 5, 4},
                {7, 8, 9}
        };

        int result = minFallingPathSum(matrix);
        System.out.println("Minimum Falling Path Sum: " + result);
    }
    public static int minFallingPathSum(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Use a DP array to store the minimum falling path sum
        int[][] dp = new int[rows][cols];

        // Copy the first row from the matrix to the DP array
        for (int col = 0; col < cols; col++) {
            dp[0][col] = matrix[0][col];
        }

        // Compute the minimum falling path sum for each element in the DP array
        for (int row = 1; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int minPrev = dp[row - 1][col];
                if (col > 0) {
                    minPrev = Math.min(minPrev, dp[row - 1][col - 1]);
                }
                if (col < cols - 1) {
                    minPrev = Math.min(minPrev, dp[row - 1][col + 1]);
                }
                dp[row][col] = matrix[row][col] + minPrev;
            }
        }

        // Find the minimum value in the last row of the DP array
        int minSum = dp[rows - 1][0];
        for (int col = 1; col < cols; col++) {
            minSum = Math.min(minSum, dp[rows - 1][col]);
        }

        return minSum;
    }


}
