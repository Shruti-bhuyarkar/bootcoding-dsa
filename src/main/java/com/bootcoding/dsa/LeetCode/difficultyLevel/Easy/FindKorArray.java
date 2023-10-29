package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

public class FindKorArray {
    public static void main(String[] args) {
        FindKorArray findKorArray = new FindKorArray();

        // Test the findKOr method
        int[] nums = {3, 1, 4, 7};
        int k = 3;
        int result = findKorArray.findKOr(nums, k);
        System.out.println("The " + k + "-th smallest integer with at least " + k + " set bits is: " + result);
    }
        public int findKOr(int[] nums, int k) {
            int[] dp = new int[31];
            for (int num : nums) {
                int i = 0;
                while (num > 0) {
                    if ((num & 1) == 1) {
                        dp[i] += 1;
                    }
                    i += 1;
                    num = num >> 1;
                }
            }
            int ans = 0;
            for (int i = 0; i < 31; i++) {
                if (dp[i] >= k) {
                    ans += (1 << i);
                }
            }
            return ans;
        }


    }


