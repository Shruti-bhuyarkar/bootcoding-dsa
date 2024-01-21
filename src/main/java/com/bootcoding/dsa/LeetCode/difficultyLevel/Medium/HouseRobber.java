package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

public class HouseRobber {
    public static void main(String[] args) {
        HouseRobber houseRobber = new HouseRobber();
        int[] nums = {2, 7, 9, 3, 1};
        int result = houseRobber.rob(nums);
        System.out.println("Maximum amount of money that can be robbed: " + result);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return nums[0];
        }

        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
        }

        return dp[n-1];
    }


}
