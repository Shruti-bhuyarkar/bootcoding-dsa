package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivideArray {

    public static void main(String[] args) {
        DivideArray solution = new DivideArray();
        int[] nums = {1, 3, 4, 6, 8, 9};
        int k = 3;
        List<List<Integer>> result = solution.divideArray(nums, k);

        System.out.println("Result: " + result);
    }

    public List<List<Integer>> divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i + 2 < nums.length; i += 3) {
            if (nums[i + 2] - nums[i] <= k) {
                result.add(Arrays.asList(nums[i], nums[i + 1], nums[i + 2]));
            } else {
                return new ArrayList<>();
            }
        }

        return result;
    }
}
