package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

public class CountEqualAndDivisiblePair {
    public static void main(String[] args) {
int[] nums = {3, 1, 2, 2, 2, 1, 3};
        System.out.println(countPairs(nums, 2));
    }
    public static int countPairs(int[] nums, int k) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && (i * j) % k == 0) {
                    n++;
                }
            }
        }
        return n;
    }
}
