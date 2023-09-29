package com.bootcoding.dsa.LeetCode.Array;
public class MonotonicArray {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3}; // Monotonic increasing
        int[] nums2 = {3, 2, 1};    // Monotonic decreasing
        int[] nums3 = {1, 3, 2};    // Not monotonic

        System.out.println("Is nums1 monotonic? " + isMonotonic(nums1)); // Output: true
        System.out.println("Is nums2 monotonic? " + isMonotonic(nums2)); // Output: true
        System.out.println("Is nums3 monotonic? " + isMonotonic(nums3)); // Output: false
    }
    public static boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                decreasing = false;
            } else if (nums[i] < nums[i - 1]) {
                increasing = false;
            }
        }

        return increasing || decreasing;
    }

}

