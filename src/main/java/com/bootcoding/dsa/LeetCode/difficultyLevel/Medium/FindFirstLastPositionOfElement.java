package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

public class FindFirstLastPositionOfElement {
    public static void main(String[] args) {
        FindFirstLastPositionOfElement findFirstLastPositionOfElement = new FindFirstLastPositionOfElement();
        int[] nums = {5, 7, 7, 8, 8, 8, 10};
        int target = 8;
        int[] result = findFirstLastPositionOfElement.searchRange(nums, target);
        if (result[0] != -1) {
            System.out.println("Target " + target + " starts at index " + result[0]);
            System.out.println("Target " + target + " ends at index " + result[1]);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }
    public int[] searchRange(int[] nums, int target) {
            int[] result = {-1, -1};
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    result[0] = i;
                    break;
                }
            }
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] == target) {
                    result[1] = i;
                    break;
                }
            }
            return result;
    }
}


