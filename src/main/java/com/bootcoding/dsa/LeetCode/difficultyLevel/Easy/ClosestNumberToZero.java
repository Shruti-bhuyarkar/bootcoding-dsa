package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

public class ClosestNumberToZero {
    public static void main(String[] args) {
    int[] nums = {-100000,-100000};
        System.out.println(findClosestNumber(nums));
    }
    public static int findClosestNumber(int[] nums) {
        int[] n = nums;
        //maths.abs() it's a method who returns the absolute(positive) value of number
        int count = Math.abs(n[n.length - 1]);
        for (int i = 0; i < n.length; i++){
            int j = Math.abs(n[i]);
            if (j < count)
                count = j;
        }
        return count;
    }
}
