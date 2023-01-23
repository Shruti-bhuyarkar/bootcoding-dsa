package com.bootcoding.dsa.LeetCode.Array;

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
        int indx = 0;
        for (int i = 0 ; i<ans.length; i++){
            for (int j = 0 ; j < nums.length; j++) {
                ans[indx] = nums[j];
                if (indx!= ans.length-1) {
                    indx++;
                }
            }
        }
        return ans;
    }
}
