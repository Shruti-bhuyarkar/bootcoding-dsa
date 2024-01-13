package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

import java.util.HashMap;
import java.util.Map;

public class MinStepsToMakeAnagram {
    public static void main(String[] args) {
        String s = "abc";
        String t = "xyz";
        int result = minSteps(s, t);
        System.out.println(result);
    }

    public static int minSteps(String s, String t) {
        if (s.length() != t.length()) {
            throw new IllegalArgumentException("Input strings must have the same length");
        }

        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of characters in string s
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Calculate the difference in frequencies for each character in string t
        int steps = 0;
        for (char c : t.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) - 1);

            // If the frequency becomes negative, it means we need to replace the character
            if (frequencyMap.get(c) < 0) {
                steps++;
            }
        }

        return steps;
    }
}
