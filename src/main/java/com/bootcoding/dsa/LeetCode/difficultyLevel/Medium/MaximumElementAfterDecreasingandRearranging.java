package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

public class MaximumElementAfterDecreasingandRearranging {

    public static int main(String[] args) {
        MaximumElementAfterDecreasingandRearranging solution = new MaximumElementAfterDecreasingandRearranging();
        int[] inputArray = {2, 2, 1, 2, 1};
        int result = solution.maximumElementAfterDecrementingAndRearranging(inputArray);
        System.out.println("Result: " + result);
        return result;
    }
        public  int maximumElementAfterDecrementingAndRearranging(int[] arr) {
            int l = arr.length;
            int[] counter = new int[l];
            for(int i = 0; i < l; i++) {
                ++counter[Math.min(arr[i] - 1, l - 1)];
            }
            int ans = 1;
            for(int i = 1; i < l; i++) {
                ans = Math.min(i + 1, ans + counter[i]);
            }
            return ans;
        }
}




