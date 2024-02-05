package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        FirstUniqueCharacter solution = new FirstUniqueCharacter();
        String s = "leetcode";
        int result = solution.firstUniqChar(s);

        System.out.println("Index of the first unique character: " + result);  // Output: 0
    }
    public int firstUniqChar(String s) {
        // Use an array to store the frequency count of each character
        int[] frequency = new int[26];

        // First pass: Count the frequency of each character
        for (char ch : s.toCharArray()) {
            frequency[ch - 'a']++;
        }

        // Second pass: Find the first character with a frequency of 1
        for (int i = 0; i < s.length(); i++) {
            if (frequency[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1; // No unique character found
    }


}

