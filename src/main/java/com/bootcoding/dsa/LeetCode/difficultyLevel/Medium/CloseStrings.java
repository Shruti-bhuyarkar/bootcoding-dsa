package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CloseStrings {
    public static void main(String[] args) {

        String word1 = "abc";
        String word2 = "bca";

        boolean result = areCloseStrings(word1, word2);

        if (result) {
            System.out.println(word1 + " and " + word2 + " are close.");
        } else {
            System.out.println(word1 + " and " + word2 + " are not close.");
        }
    }
    public static boolean areCloseStrings(String word1, String word2) {
        // Step 1: Check if the lengths are the same
        if (word1.length() != word2.length()) {
            return false;
        }

        // Step 2: Count the frequency of each character in both strings
        Map<Character, Integer> count1 = getCharacterFrequency(word1);
        Map<Character, Integer> count2 = getCharacterFrequency(word2);

        // Step 3: Check if the set of characters is the same
        if (!count1.keySet().equals(count2.keySet())) {
            return false;
        }

        // Step 4: Check if the frequency counts are the same
        Integer[] values1 = count1.values().toArray(new Integer[0]);
        Integer[] values2 = count2.values().toArray(new Integer[0]);

        Arrays.sort(values1);
        Arrays.sort(values2);

        return Arrays.equals(values1, values2);
    }

    private static Map<Character, Integer> getCharacterFrequency(String word) {
        Map<Character, Integer> frequency = new HashMap<>();
        for (char c : word.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }
        return frequency;
    }


}
