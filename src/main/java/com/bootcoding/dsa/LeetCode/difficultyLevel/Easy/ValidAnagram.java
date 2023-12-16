package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;
// Valid Anagram
public class ValidAnagram {
    public static void main(String[] args) {
        ValidAnagram solution = new ValidAnagram();

        String s = "anagram";
        String t = "nagaram";

        boolean result = solution.isAnagram(s, t);

        System.out.println("Are the strings anagrams? " + result);
    }
        public boolean isAnagram(String s, String t) {
            // Check if the lengths are equal
            if (s.length() != t.length()) {
                return false;
            }

            // Array to store counts of characters
            int[] charCounts = new int[26];

            // Increment counts for characters in string s
            for (char c : s.toCharArray()) {
                charCounts[c - 'a']++;
            }

            // Decrement counts for characters in string t
            for (char c : t.toCharArray()) {
                charCounts[c - 'a']--;
            }

            // Check if all counts are zero
            for (int count : charCounts) {
                if (count != 0) {
                    return false;
                }
            }

            return true;
        }


    }


