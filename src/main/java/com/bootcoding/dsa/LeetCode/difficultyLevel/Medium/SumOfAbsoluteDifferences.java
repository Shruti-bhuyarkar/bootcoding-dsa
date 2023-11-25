package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

public class SumOfAbsoluteDifferences {
    public static void main(String[] args) {
        SumOfAbsoluteDifferences solution = new SumOfAbsoluteDifferences();

        int[] nums = {2, 3, 5};
        int[] result = solution.getSumAbsoluteDifferences(nums);

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
        public int[] getSumAbsoluteDifferences(int[] nums) {
            int n = nums.length;
            int[] prefixSum = new int[n];
            int[] suffixSum = new int[n];

            // Calculate prefix sum
            prefixSum[0] = nums[0];
            for (int i = 1; i < n; i++) {
                prefixSum[i] = prefixSum[i - 1] + nums[i];
            }

            // Calculate suffix sum
            suffixSum[n - 1] = nums[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                suffixSum[i] = suffixSum[i + 1] + nums[i];
            }

            int[] result = new int[n];

            for (int i = 0; i < n; i++) {
                // Calculate sum(|nums[i] - nums[j]|) using prefix and suffix sums
                int leftSum = i * nums[i] - (i > 0 ? prefixSum[i - 1] : 0);
                int rightSum = (i < n - 1 ? suffixSum[i + 1] : 0) - (n - 1 - i) * nums[i];

                result[i] = leftSum + rightSum;
            }

            return result;
        }


    }


