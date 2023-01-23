package com.bootcoding.dsa.LeetCode.Array;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        boolean T = containsDuplicate(nums);
        System.out.println(T);

    }
    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0;i<nums.length;i++){
            for (int j = i+1; j<nums.length; j++){
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
