package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        ThreeSum solution = new ThreeSum();

        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = solution.threeSum(nums);

        System.out.println("Triplets that sum to zero: " + result);
    }
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();

            // Sort the array
            Arrays.sort(nums);

            int n = nums.length;

            for (int i = 0; i < n - 2; i++) {
                // Skip duplicate elements
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }

                int target = -nums[i];
                int left = i + 1;
                int right = n - 1;

                while (left < right) {
                    int sum = nums[left] + nums[right];

                    if (sum == target) {
                        // Found a triplet
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                        // Skip duplicate elements
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }

                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }

            return result;
        }
    }


