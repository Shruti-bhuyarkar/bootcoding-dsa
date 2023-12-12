package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;
//Maximum Product of Two Elements in an Array
public class MaximumProductTwoElements {
    public static void main(String[] args) {
        MaximumProductTwoElements solution = new MaximumProductTwoElements();

        int[] nums = {3, 4, 5, 2};
        int result = solution.maxProduct(nums);

        System.out.println("Maximum product of two elements: " + result);
    }
        public int maxProduct(int[] nums) {
            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;

            for (int num : nums) {
                if (num >= max1) {
                    max2 = max1;
                    max1 = num;
                } else if (num > max2) {
                    max2 = num;
                }
            }

            return (max1 - 1) * (max2 - 1);
        }


    }


