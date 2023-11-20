package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

public class ReductionOperationstoMakeArrayElementsEqual {

    public static void main(String[] args) {

        ReductionOperationstoMakeArrayElementsEqual R = new ReductionOperationstoMakeArrayElementsEqual();
        int[] nums = {5, 1, 3};
        int result = R.reductionOperations(nums);
        System.out.println("Reduction Operations: " + result);
    }

        public int reductionOperations(int[] nums) {
            int n = nums.length;
            int[] freq = new int[50001];
            for (int i = 0; i < n; i++) {
                freq[nums[i]]++;
            }
            int res = 0, operations = 0;
            for (int i = 50000; i >= 1; i--) {
                if (freq[i] > 0) {
                    operations += freq[i];
                    res += operations - freq[i];
                }
            }
            return res;
        }

    }


