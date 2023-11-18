package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;
import java.util.Arrays;
public class FrequencyMostFrequentElement {

    public static void main(String[] args) {
        // Example usage:
        FrequencyMostFrequentElement f = new FrequencyMostFrequentElement();
        int[] nums = {1, 2, 4};
        int k = 5;
        int result = f.maxFrequency(nums, k);
        System.out.println("Maximum Frequency: " + result);
    }
        public int maxFrequency(int[] nums, int k) {
            // Step 1: Sort the array in ascending order
            Arrays.sort(nums);

            int left = 0; // Left pointer
            int result = 1; // Initialize result with at least one element

            long sum = 0; // Variable to store the sum of elements in the current window

            // Step 2: Use a sliding window approach
            for (int right = 0; right < nums.length; right++) {
                sum += nums[right];

                // Step 3: Check if the size of the window exceeds k
                while ((long) (nums[right] * (right - left + 1)) - sum > k) {
                    sum -= nums[left];
                    left++;
                }

                // Step 4: Update the result with the maximum window size
                result = Math.max(result, right - left + 1);
            }

            return result;
        }


    }


