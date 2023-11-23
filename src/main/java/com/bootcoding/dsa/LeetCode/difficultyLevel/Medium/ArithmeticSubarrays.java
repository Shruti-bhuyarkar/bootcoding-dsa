package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArithmeticSubarrays {
    public static void main(String[] args) {
        ArithmeticSubarrays arithmeticSubarrays = new ArithmeticSubarrays();

        int[] nums = {4, 6, 5, 9, 3, 7};
        int[] l = {0, 0, 2};
        int[] r = {2, 3, 5};

        List<Boolean> result = arithmeticSubarrays.checkArithmeticSubarrays(nums, l, r);

        System.out.println("Results:");
        for (boolean res : result) {
            System.out.println(res);
        }
    }


        public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
            List<Boolean> result = new ArrayList<>();

            for (int i = 0; i < l.length; i++) {
                int left = l[i];
                int right = r[i];

                // Create a subarray from the given range
                int[] subarray = Arrays.copyOfRange(nums, left, right + 1);

                // Sort the subarray to check for arithmetic sequence
                Arrays.sort(subarray);

                // Check if the sorted subarray is arithmetic
                result.add(isArithmetic(subarray));
            }

            return result;
        }

        private boolean isArithmetic(int[] array) {
            int diff = array[1] - array[0];

            for (int i = 1; i < array.length - 1; i++) {
                if (array[i + 1] - array[i] != diff) {
                    return false;
                }
            }

            return true;
        }
    }


