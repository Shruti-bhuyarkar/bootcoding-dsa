package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

public class FindUniqueBinaryString {
    public static void main(String[] args) {
        // Example usage:
        FindUniqueBinaryString solution = new FindUniqueBinaryString();
        String[] inputArray = {"01", "10", "00"};
        String result = solution.findDifferentBinaryString(inputArray);
        System.out.println("Result: " + result);
    }

        public String findDifferentBinaryString(String[] nums) {
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < nums.length; i++) {
                sb.append(nums[i].charAt(i) == '0' ? '1' : '0');
            }
            return sb.toString();
        }



}
