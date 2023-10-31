package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

public class FindOriginalArrayPrefixXor {
    public static void main(String[] args) {
        FindOriginalArrayPrefixXor findOriginalArrayPrefixXor = new FindOriginalArrayPrefixXor();

        // Test the findArray method
        int[] pref = {1, 2, 3, 4, 5};
        int[] resultArray = findOriginalArrayPrefixXor.findArray(pref);

        System.out.println("Original Array:");
        for (int num : pref) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Modified Array (XOR of adjacent elements):");
        for (int num : resultArray) {
            System.out.print(num + " ");
        }
    }
        public int[] findArray(int[] pref) {
            int[] result = new int[pref.length];
            result[0] = pref[0];
            for (int i = 1; i < pref.length; i++) {
                result[i] = pref[i] ^ pref[i - 1];
            }
            return result;
        }


    }


