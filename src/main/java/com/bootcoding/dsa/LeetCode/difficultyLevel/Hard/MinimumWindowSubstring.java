package com.bootcoding.dsa.LeetCode.difficultyLevel.Hard;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t)); // Output: "BANC"
    }
    public static String minWindow(String s, String t) {
        Map<Character, Integer> targetFreqMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetFreqMap.put(c, targetFreqMap.getOrDefault(c, 0) + 1);
        }

        int requiredChars = targetFreqMap.size();
        int left = 0, right = 0;
        int formedChars = 0;

        Map<Character, Integer> windowFreqMap = new HashMap<>();
        int[] result = {-1, 0, 0}; // length, start, end

        while (right < s.length()) {
            char currentChar = s.charAt(right);
            windowFreqMap.put(currentChar, windowFreqMap.getOrDefault(currentChar, 0) + 1);

            if (targetFreqMap.containsKey(currentChar) && windowFreqMap.get(currentChar).equals(targetFreqMap.get(currentChar))) {
                formedChars++;
            }

            while (formedChars == requiredChars) {
                int currentLength = right - left + 1;

                if (result[0] == -1 || currentLength < result[0]) {
                    result[0] = currentLength;
                    result[1] = left;
                    result[2] = right + 1;
                }

                char leftChar = s.charAt(left);
                windowFreqMap.put(leftChar, windowFreqMap.get(leftChar) - 1);

                if (targetFreqMap.containsKey(leftChar) && windowFreqMap.get(leftChar) < targetFreqMap.get(leftChar)) {
                    formedChars--;
                }

                left++;
            }

            right++;
        }

        return result[0] == -1 ? "" : s.substring(result[1], result[2]);
    }


}

