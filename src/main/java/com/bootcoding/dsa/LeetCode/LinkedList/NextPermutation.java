package com.bootcoding.dsa.LeetCode.LinkedList;

public class NextPermutation {
           public static void main(String[] args) {
            int[] nums = {1, 2, 3}; System.out.println("Original Array: " + arrayToString(nums));
            solution.nextPermutation(nums);
            System.out.println("Next Permutation: " + arrayToString(nums));
        }
        public static String arrayToString(int[] nums) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < nums.length; i++) {
                sb.append(nums[i]);
                if (i < nums.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }
    class solution {
        public static void nextPermutation(int[] nums) {
            int i = nums.length - 2;
            while (i >= 0 && nums[i] >= nums[i + 1]) {
                i--;
            }
            if (i == -1) {
                reverse(nums, 0, nums.length - 1);
                return;
            }
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
            reverse(nums, i + 1, nums.length - 1);
        }
        private static void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        private static void reverse(int[] nums, int left, int right) {
            while (left < right) {
                swap(nums, left, right);
                left++;
                right--;
            }
        }
    }

