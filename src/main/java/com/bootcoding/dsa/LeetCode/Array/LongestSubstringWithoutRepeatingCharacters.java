package com.bootcoding.dsa.LeetCode.Array;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int maxLength = lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + maxLength);
    }
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLength = 0;
        int start = 0;
        int end = 0;
        Set<Character> uniqueChars = new HashSet<>();

        while (end < s.length()) {
            if (!uniqueChars.contains(s.charAt(end))) {
                uniqueChars.add(s.charAt(end));
                end++;
                maxLength = Math.max(maxLength, end - start);
            } else {
                uniqueChars.remove(s.charAt(start));
                start++;
            }
        }

        return maxLength;
    }
}
