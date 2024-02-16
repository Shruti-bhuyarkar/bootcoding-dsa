package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

import java.util.*;

public class LeastUniqueIntegers {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 1, 3, 3, 2, 4, 4};
        int k = 3;

        int result = findLeastNumOfUniqueInts(arr, k);
        System.out.println("Least Number of Unique Integers: " + result);
    }

        public static int findLeastNumOfUniqueInts(int[] arr, int k) {
            // Step 1: Count the frequency of each element
            Map<Integer, Integer> frequencyMap = new HashMap<>();
            for (int num : arr) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }

            // Step 2: Create a list of frequencies and sort it in ascending order
            List<Integer> frequencies = new ArrayList<>(frequencyMap.values());
            Collections.sort(frequencies);

            // Step 3: Remove the least frequent elements until k becomes zero
            int uniqueCount = frequencies.size();
            for (int freq : frequencies) {
                if (k >= freq) {
                    k -= freq;
                    uniqueCount--;
                } else {
                    break;
                }
            }

            return uniqueCount;
        }


    }

