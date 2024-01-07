package com.bootcoding.dsa.LeetCode.difficultyLevel.Hard;

import java.util.HashMap;
import java.util.Map;

public class ArithmeticSlicesII {
    public static void main(String[] args) {
        ArithmeticSlicesII solution = new ArithmeticSlicesII();

        int[] nums = {2, 4, 6, 8, 10};
        int result = solution.numberOfArithmeticSlices(nums);
        System.out.println("Number of Arithmetic Subsequences: " + result);
    }
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int count = 0;

        // dp array to store the number of arithmetic subsequences ending at each index
        Map<Integer, Integer>[] dp = new Map[n];

        for (int i = 0; i < n; i++) {
            dp[i] = new HashMap<>();
            for (int j = 0; j < i; j++) {
                long diff = (long) nums[i] - nums[j];
                if (diff >= Integer.MIN_VALUE && diff <= Integer.MAX_VALUE) {
                    int d = (int) diff;
                    int c1 = dp[i].getOrDefault(d, 0);
                    int c2 = dp[j].getOrDefault(d, 0);
                    count += c2; // Add the count of subsequences ending at index j with the same difference
                    dp[i].put(d, c1 + c2 + 1); // Update the count at index i
                }
            }
        }

        return count;
    }


}
