package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 1};
        int[] ans =getConcatenation(nums);
        for (int i = 0; i<ans.length; i++){
            System.out.println(ans[i]);
        }
    }
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n*2] ;
        int index = 0;
        for (int i = 0 ; i<ans.length; i++){
            for (int j = 0 ; j < nums.length; j++) {
                ans[index] = nums[j];
                if (index!= ans.length-1) {
                    index++;
                }
            }
        }
        return ans;
    }
}
