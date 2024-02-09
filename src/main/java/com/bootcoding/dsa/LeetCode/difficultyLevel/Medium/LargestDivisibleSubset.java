package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset {
    public static void main(String[] args) {
        LargestDivisibleSubset solution = new LargestDivisibleSubset();
        int[] nums = {1, 2, 3};
        List<Integer> result = solution.largestDivisibleSubset(nums);

        System.out.println("Largest Divisible Subset: " + result);  // Output: [1, 2] or [1, 3]
    }

    public List<Integer> largestDivisibleSubset(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        // Sort the array
        Arrays.sort(nums);

        // Create arrays to store the size and previous index of the largest divisible subset
        int[] dp = new int[nums.length];
        int[] prevIndex = new int[nums.length];

        // Initialize arrays
        Arrays.fill(dp, 1);
        Arrays.fill(prevIndex, -1);

        // Find the largest divisible subset
        int maxSize = 1, maxIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] % nums[j] == 0 && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    prevIndex[i] = j;

                    if (dp[i] > maxSize) {
                        maxSize = dp[i];
                        maxIndex = i;
                    }
                }
            }
        }

        // Build the largest divisible subset
        List<Integer> result = new ArrayList<>();
        while (maxIndex != -1) {
            result.add(nums[maxIndex]);
            maxIndex = prevIndex[maxIndex];
        }

        return result;
    }
}


