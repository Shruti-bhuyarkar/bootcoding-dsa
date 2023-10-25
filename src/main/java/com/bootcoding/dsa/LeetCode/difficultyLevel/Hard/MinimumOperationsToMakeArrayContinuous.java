package com.bootcoding.dsa.LeetCode.difficultyLevel.Hard;
import java.util.Arrays;
import java.util.HashSet;

public class MinimumOperationsToMakeArrayContinuous {
    public static void main(String[] args) {
        MinimumOperationsToMakeArrayContinuous solution = new MinimumOperationsToMakeArrayContinuous();
        int[] nums = {4, 2, 5, 3};
        int result = solution.minOperations(nums);
        System.out.println("Minimum Operations: " + result);  // Output: 0
    }
    public int minOperations(int[] nums) {
        int output = Integer.MAX_VALUE, j = 1;
        Arrays.sort(nums);
        HashSet<Integer> info = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int a = nums[i], b = nums[i] + nums.length - 1;
            info.add(a);

            while (j < nums.length && nums[j] <= b) {
                info.add(nums[j++]);
            }

            output = Math.min(output, nums.length - info.size());
            info.remove(a);
        }

        return output;
    }


}
