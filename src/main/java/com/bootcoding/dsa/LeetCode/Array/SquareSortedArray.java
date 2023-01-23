package com.bootcoding.dsa.LeetCode.Array;

import java.util.Arrays;

public class SquareSortedArray {
    public static void main(String[] args) {
    int[] nums = {-4, -1, 0, 3, 10};
    int[] square = sortedSquares(nums);
    for (int i = 0; i < square.length; i++) {
        System.out.println(square[i]);
    }
    }
    public static int[] sortedSquares(int[] nums){
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
