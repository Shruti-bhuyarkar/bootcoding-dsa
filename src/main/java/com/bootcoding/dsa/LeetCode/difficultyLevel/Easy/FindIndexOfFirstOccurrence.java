package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

public class FindIndexOfFirstOccurrence {
        public static void main(String[] args) {
            FindIndexOfFirstOccurrence findIndexOfFirstOccurrence = new FindIndexOfFirstOccurrence();

            String haystack = "sadbutsad";
            String needle = "sad";

            int index = findIndexOfFirstOccurrence.strStr(haystack, needle);

            if (index != -1) {
                System.out.println("Needle found at index: " + index);
            } else {
                System.out.println("Needle not found in haystack.");
            }
        }
        public int strStr(String haystack, String needle) {
            //    for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            //         if (haystack.substring(i, i + needle.length()).equals(needle)) {
            //             return i;
            //         }
            //     }
            //     return -1;
            return haystack.indexOf(needle);
        }
    }



