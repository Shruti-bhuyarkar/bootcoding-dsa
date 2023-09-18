package com.bootcoding.dsa.LeetCode.Array;

public class SearchRotatedSortedArray {
          public static void main(String[] args) {
            int[] nums = {4, 2, 8, 6, 1, 9, 5};
            int target = 6;
            int result = search(nums, target);
            if (result != -1) {
                System.out.println("Target " + target + " found at index " + result);
            } else {
                System.out.println("Target " + target + " not found in the array.");
            }
        }
        public static int search(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    return i;
                }
            }
            return -1;
        }
    }


