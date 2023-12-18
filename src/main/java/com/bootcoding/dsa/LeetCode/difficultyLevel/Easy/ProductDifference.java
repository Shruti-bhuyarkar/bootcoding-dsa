package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;
// Maximum Product Difference Between Two Pairs
import java.util.Arrays;

public class ProductDifference {
    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 9, 7, 4, 8};
        int result = maxProductDifference(nums);
        System.out.println("Maximum Product Difference: " + result);
    }
            public static int maxProductDifference(int[] nums) {
            // Sort the array in ascending order
            Arrays.sort(nums);

            // Find the maximum and second maximum elements
            int max1 = nums[nums.length - 1];
            int max2 = nums[nums.length - 2];


            // Find the minimum and second minimum elements
            int min1 = nums[0];
            int min2 = nums[1];

            // Calculate the maximum product difference
            int result = (max1 * max2) - (min1 * min2);

            return result;
        }


    }


