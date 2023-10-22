package com.bootcoding.dsa.LeetCode.Array;

public class MaximumScoreofGoodSubarray {
    public static void main(String[] args) {
        MaximumScoreofGoodSubarray maximumScoreofGoodSubarray = new MaximumScoreofGoodSubarray();

        // Example usage:
        int[] nums = {1, 4, 3, 7, 4, 5};
        int k = 3;
        int result = maximumScoreofGoodSubarray.maximumScore(nums, k);
        System.out.println("Maximum Score: " + result);
    }
        public int maximumScore(int[] nums, int k) {
            int left = k, right = k;
            int min_val = nums[k];
            int max_score = min_val;

            while (left > 0 || right < nums.length - 1) {
                if (left == 0 || (right < nums.length - 1 && nums[right + 1] > nums[left - 1])) {
                    right++;
                } else {
                    left--;
                }
                min_val = Math.min(min_val, Math.min(nums[left], nums[right]));
                max_score = Math.max(max_score, min_val * (right - left + 1));
            }

            return max_score;
        }


    }


