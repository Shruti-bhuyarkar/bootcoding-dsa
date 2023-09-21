package com.bootcoding.dsa.LeetCode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetIndices {
    public static void main(String[] args) {
    int[] nums = {1, 2, 5, 2, 3};
    //int target = 0;
    List<Integer> TI = targetIndices(nums, 2);
    for (int i = 0; i< TI.size(); i++){
        System.out.println(TI.get(i));
        }
    }
    public static  List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> index = new ArrayList<>();
        for (int i = 0 ; i < nums.length ; i++){

            if(nums[i] == target){
                index.add(i);
            }
        }
        return index;
    }
}
