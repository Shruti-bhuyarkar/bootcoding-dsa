package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

import java.util.Stack;

public class SumOfSubarrayMinimums {
    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 4};

        int result = sumSubarrayMins(arr);
        System.out.println("Sum of Subarray Minimums: " + result);
    }
    public static int sumSubarrayMins(int[] arr) {
        int MOD = 1000000007;
        int n = arr.length;
        long result = 0;

        Stack<Integer> stack = new Stack<>();
        int[] left = new int[n];
        int[] right = new int[n];

        // Calculate the number of subarrays where each element is the minimum
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        stack.clear();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }

        // Calculate the contribution of each element to the result
        for (int i = 0; i < n; i++) {
            result = (result + (long) arr[i] * left[i] * right[i]) % MOD;
        }

        return (int) result;
    }


}

