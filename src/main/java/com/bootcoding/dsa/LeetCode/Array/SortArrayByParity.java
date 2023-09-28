package com.bootcoding.dsa.LeetCode.Array;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4, 6, 5, 8, 7};
        int[] result = sortArrayByParity(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public static int[] sortArrayByParity(int[] nums) {
            int left = 0;
            int right = nums.length - 1;
            while (left < right) {
                while (left < right && nums[left] % 2 == 0) {
                    left++;
                }
                while (left < right && nums[right] % 2 != 0) {
                    right--;
                }
                if (left < right) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                }
            }
            return nums;
    }
}
