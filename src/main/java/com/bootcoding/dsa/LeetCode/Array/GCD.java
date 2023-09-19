package com.bootcoding.dsa.LeetCode.Array;

import java.util.HashMap;

public class GCD {
    public static void main(String[] args) {
        int[] nums = {10,6, 9};
        System.out.println(getGCD(nums));
    }    public static int getGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > max)
                max = nums[i];
            else if(nums[i] < min)
                min = nums[i];
        }
        return gcdTwo(min, max);
    }
    private static int gcdOne(int min, int max){
        int gcd = 1;
        for(int i = 2; i <= min; i++){
            if(min % i == 0 && max % i == 0)
                gcd = i;
        }
        return gcd;
    }
    private static int gcdTwo(int min, int max){
        if(min == 0)
            return max;
        return gcdTwo(max % min, min);
    }
}
