package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SignRearranger {
    public static void main(String[] args) {
        SignRearranger rearranger = new SignRearranger();

        int[] nums = {1, -2, 3, -4, 5, -6};
        int[] result = rearranger.rearrangeBySign(nums);

        System.out.println(Arrays.toString(result));
    }
    public int[] rearrangeBySign(int[] nums) {
        int n = nums.length;

        // Separate positive and negative numbers into two separate lists
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        for (int num : nums) {
            if (num > 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }

        // Merge the positive and negative lists, preserving the order
        int i = 0, j = 0, k = 0;

        // Start with a positive number
        if (positive.size() > 0) {
            nums[k++] = positive.get(i++);
        }

        while (i < positive.size() && j < negative.size()) {
            // Alternate between positive and negative numbers
            nums[k++] = negative.get(j++);
            nums[k++] = positive.get(i++);
        }

        // If there are remaining positive numbers, copy them to the result array
        while (i < positive.size()) {
            nums[k++] = positive.get(i++);
        }

        // If there are remaining negative numbers, copy them to the result array
        while (j < negative.size()) {
            nums[k++] = negative.get(j++);
        }

        return nums;
    }


}

