package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;


public class BitwiseAndRange {

    public static void main(String[] args) {
        BitwiseAndRange solution = new BitwiseAndRange();

        int left = 5;
        int right = 7;

        int result = solution.rangeBitwiseAnd(left, right);

        System.out.println("Bitwise AND of Numbers Range: " + result);
    }
    public int rangeBitwiseAnd(int left, int right) {
        int shift = 0;

        while (left < right) {
            left >>= 1;
            right >>= 1;
            shift++;
        }

        return left << shift;
    }

}
