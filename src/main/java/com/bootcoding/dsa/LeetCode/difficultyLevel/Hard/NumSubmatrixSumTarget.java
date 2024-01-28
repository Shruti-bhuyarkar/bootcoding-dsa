package com.bootcoding.dsa.LeetCode.difficultyLevel.Hard;

import java.util.HashMap;
import java.util.Map;

public class NumSubmatrixSumTarget {

    public static void main(String[] args) {
        NumSubmatrixSumTarget solution = new NumSubmatrixSumTarget();
        int[][] matrix = {
                {0, 1, 0},
                {1, 1, 1},
                {0, 1, 0}
        };
        int target = 0;
        System.out.println(solution.numSubmatrixSumTarget(matrix, target)); // Output: 4
    }
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int count = 0;

        for (int left = 0; left < n; left++) {
            int[] rowSum = new int[m];

            for (int right = left; right < n; right++) {
                // Calculate the running sum for each row in the current submatrix
                for (int i = 0; i < m; i++) {
                    rowSum[i] += matrix[i][right];
                }

                // Use HashMap to store the prefix sum and its count
                Map<Integer, Integer> prefixSumCount = new HashMap<>();
                int currentSum = 0;

                // Traverse the rowSum array and count the submatrices with the target sum
                for (int sum : rowSum) {
                    currentSum += sum;

                    if (currentSum == target) {
                        count++;
                    }

                    // If there is a subarray with a sum (currentSum - target), add its count to the result
                    count += prefixSumCount.getOrDefault(currentSum - target, 0);

                    // Update the prefix sum count
                    prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
                }
            }
        }

        return count;
    }

}

