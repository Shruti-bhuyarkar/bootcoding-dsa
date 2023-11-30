package com.bootcoding.dsa.LeetCode.difficultyLevel.Hard;
import java.util.*;
public class ConstrainedSubsequenceSum {

    public static void main(String[] args) {
        ConstrainedSubsequenceSum constrainedSubsequenceSum = new ConstrainedSubsequenceSum();

        int[] nums = {10, -2, -10, 5, 20};
        int k = 2;
        int result = constrainedSubsequenceSum.constrainedSubsetSum(nums, k);
        System.out.println("Maximum Constrained Subset Sum: " + result);
    }
        public int constrainedSubsetSum(int[] nums, int k) {
            Deque<Integer> dq = new LinkedList<>();
            for (int i = 0; i < nums.length; i++) {
                nums[i] += !dq.isEmpty() ? nums[dq.peekFirst()] : 0;

                while (!dq.isEmpty() && (i - dq.peekFirst() >= k || nums[i] >= nums[dq.peekLast()])) {
                    if (nums[i] >= nums[dq.peekLast()]) {
                        dq.pollLast();
                    } else {
                        dq.pollFirst();
                    }
                }

                if (nums[i] > 0) {
                    dq.offerLast(i);
                }
            }

            int maxSum = Integer.MIN_VALUE;
            for (int num : nums) {
                maxSum = Math.max(maxSum, num);
            }

            return maxSum;
        }


    }


