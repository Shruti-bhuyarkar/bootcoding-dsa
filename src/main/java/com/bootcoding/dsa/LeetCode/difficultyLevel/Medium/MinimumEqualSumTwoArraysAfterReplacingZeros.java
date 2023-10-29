package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

public class MinimumEqualSumTwoArraysAfterReplacingZeros {
    public static void main(String[] args) {
        MinimumEqualSumTwoArraysAfterReplacingZeros minimumEqualSumTwoArraysAfterReplacingZeros = new MinimumEqualSumTwoArraysAfterReplacingZeros();

        // Test cases
        int[] nums1 = {1, 2, 0, 0, 2};
        int[] nums2 = {2, 1, 0, 1, 0};
        long result = minimumEqualSumTwoArraysAfterReplacingZeros.minSum(nums1, nums2);
        System.out.println("Minimum possible sum: " + result);
    }
        public long minSum(int[] nums1, int[] nums2) {
            long[] sum = new long[2];
            int[] zero = new int[2];

            for (int num : nums1) {
                if (num == 0) {
                    zero[0]++;
                }
                sum[0] += num;
            }

            for (int num : nums2) {
                if (num == 0) {
                    zero[1]++;
                }
                sum[1] += num;
            }

            // Both arrays have zeros, replace all zeros with ones in one array
            if (zero[0] > 0 && zero[1] > 0) {
                return Math.max(sum[0] + zero[0], sum[1] + zero[1]);
            }

            // One of the arrays has zeros
            if (zero[0] > 0 && zero[1] == 0) {
                if (sum[0] < sum[1] && sum[0] + zero[0] <= sum[1]) {
                    return sum[1];
                }
            }

            if (zero[0] == 0 && zero[1] > 0) {
                if (sum[0] > sum[1] && sum[0] >= sum[1] + zero[1]) {
                    return sum[0];
                }
            }

            // No zeros in both arrays
            if (zero[0] + zero[1] == 0) {
                if (sum[0] == sum[1]) {
                    return sum[1];
                }
            }

            return -1; // Return -1 if none of the conditions are met
        }


    }


