package com.bootcoding.dsa.LeetCode.Array;
import java.util.Stack;

public class Find132Pattern {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4}; // Change this array as needed
        boolean has132Pattern = find132pattern(nums);

        if (has132Pattern) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
           public static boolean find132pattern(int[] nums) {
            int n = nums.length;
            if (n < 3) {
                return false;
            }

            int[] minArray = new int[n];
            minArray[0] = nums[0];

            for (int i = 1; i < n; i++) {
                minArray[i] = Math.min(minArray[i - 1], nums[i]);
            }

            Stack<Integer> stack = new Stack<>();

            for (int j = n - 1; j >= 0; j--) {
                if (nums[j] > minArray[j]) {
                    while (!stack.isEmpty() && stack.peek() <= minArray[j]) {
                        stack.pop();
                    }
                    if (!stack.isEmpty() && stack.peek() < nums[j]) {
                        return true;
                    }
                    stack.push(nums[j]);
                }
            }
            return false;
        }
    }


