package com.bootcoding.dsa.Array;
//WAM to return positive element array from given array
// [10,-20,30,-5] ==[10,30]
public class ReturnPositive {
    public static void main(String[] args) {
        int[] nums = {10,-20,30,-5};
        int[] pos = findPositiveElements(nums);
        System.out.println("Positive Array");
        for (int i = 0; i < pos.length; i++) {
            System.out.println(pos[i]);
        }
    }
    public static int[] findPositiveElements(int[] nums) {
        int countOfPos = getPositiveElements(nums) ;
        int[] posCollector = new int[countOfPos];
        int j =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                posCollector[j++] = nums[i];
            }
        }
        return posCollector;
    }
    public static int getPositiveElements(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                counter++;
            }
        }
        return counter;
    }
}
