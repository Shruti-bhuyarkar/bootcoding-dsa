package com.bootcoding.dsa.Array;
//WAM to return negative element array from given array
// [10,-20,30,-5] ==[-20,-5]

public class ReturnNegative {
    public static void main(String[] args) {
        int[] nums = {10,-20,30,-5};

        int[] neg = findNegativeElements(nums);

        System.out.println("Negative Array");
        for (int i = 0; i < neg.length; i++) {
            System.out.println(neg[i]);
        }

    }

    public static int[] findNegativeElements(int[] nums) {
        int CountOfNeg = getNegativeCounter(nums);
        int[] negcollector = new int[CountOfNeg];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                negcollector[j++] = nums[i];
            }
        }
        return negcollector;

    }

    public static int getNegativeCounter(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                counter++;
            }
        }
        return counter;
    }
}