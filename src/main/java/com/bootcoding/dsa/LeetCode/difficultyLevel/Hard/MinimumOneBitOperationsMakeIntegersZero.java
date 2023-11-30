package com.bootcoding.dsa.LeetCode.difficultyLevel.Hard;

public class MinimumOneBitOperationsMakeIntegersZero {
    public static void main(String[] args) {
        MinimumOneBitOperationsMakeIntegersZero solution = new MinimumOneBitOperationsMakeIntegersZero();

        int n = 3;
        int result = solution.minimumOneBitOperations(n);

        System.out.println("Minimum number of operations to transform " + n + " into 0: " + result);
    }

        int min = Integer.MAX_VALUE;
        public int minimumOneBitOperations(int n) {
            if (n <= 1) return n;
            int count = 0;
            while ((1<<count) <= n) count++;
            return ((1<<count)-1) - minimumOneBitOperations(n-(1<<(count-1)));
        }

    }

