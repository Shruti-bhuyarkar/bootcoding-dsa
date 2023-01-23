package com.bootcoding.dsa.LeetCode.Array;

public class CountOfNumSmallerThanCurrent {
    public static void main(String[] args) {
    int[] nums = {8, 1, 2, 2, 3};
    int[] SMTC = smallerNumbersThanCurrent(nums);
    for (int i = 0; i<SMTC.length; i++){
        System.out.println(SMTC[i]);
    }
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] nums2 = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            int count = 0;
            for (int j = 0; j<nums.length; j++){
                if (nums[j] < nums[i]){
                    count++;
                }
            }
            nums2[i] = count;
        }
        return nums2;
    }
}
