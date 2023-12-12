package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;
// 3Sum Closest
import java.util.Arrays;
public class ThreeSumClosest {

    public static void main(String[] args) {
        ThreeSumClosest solution = new ThreeSumClosest();

        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int result = solution.threeSumClosest(nums, target);

        System.out.println("Closest sum to target: " + result);
    }
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);

            int closestSum = nums[0] + nums[1] + nums[2];

            for (int i = 0; i < nums.length - 2; i++) {
                int left = i + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int currentSum = nums[i] + nums[left] + nums[right];

                    if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                        closestSum = currentSum;
                    }

                    if (currentSum < target) {
                        left++;
                    } else if (currentSum > target) {
                        right--;
                    } else {
                        return closestSum;
                    }
                }
            }

            return closestSum;
        }


    }


