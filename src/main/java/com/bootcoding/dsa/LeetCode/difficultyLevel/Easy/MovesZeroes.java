package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

public class MovesZeroes {
    public static void main(String[] args) {
        int[] n = {0, 1, 0, 3, 12};
       int[] num =  MovesZeroes(n);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
    public static int[] MovesZeroes(int[] nums) {
        int n = nums.length;
        if (n < 2)
            return nums;
        int left = 0, right = 0;
        int temp;
        //re-arrange
        while (right < n) {
            if (nums[right] == 0) {
                right++;
            } else {
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right++;
            }
        }
        return nums;
    }
}