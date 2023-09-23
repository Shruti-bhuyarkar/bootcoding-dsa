package com.bootcoding.dsa.LeetCode.LinkedList;

public class ContainDuplicate {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(printcontainsDuplicate(nums));
    }
    public static boolean printcontainsDuplicate(int[] nums) {
            for (int i = 0; i<nums.length; i++){
                for (int j = (i+1); j<nums.length; j++){
                    if (nums[i]==nums[j]){
                        return true;
                    }
                }
            }
            return false;
        }
    }


