package com.bootcoding.dsa.LeetCode.Array;

public class FindIndexOfFirstOccurrence {
        public static void main(String[] args) {
            Solution solution = new Solution();

            String haystack = "sadbutsad";
            String needle = "sad";

            int index = solution.strStr(haystack, needle);

            if (index != -1) {
                System.out.println("Needle found at index: " + index);
            } else {
                System.out.println("Needle not found in haystack.");
            }
        }
    }
    class Solution {
        public int strStr(String haystack, String needle) {
            return haystack.indexOf(needle);
        }
    }


