package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

import java.util.Arrays;

public class LargestPerimeterFinder {
    public static void main(String[] args) {
        LargestPerimeterFinder perimeter = new LargestPerimeterFinder();

        // Example usage:
        int[] nums = {3, 2, 3, 4};
        int result = perimeter.largestPerimeter(nums);

        System.out.println("Largest Perimeter: " + result);
    }

    public static int largestPerimeter(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int num : nums) {
            sum += num;
        }
        int n = nums.length;
        for (int i = n - 1; i >= 2; i--) {
            sum -= nums[i];
            if (sum > nums[i]) {
                return sum + nums[i];
            }
        }
        return -1;
    }
}
