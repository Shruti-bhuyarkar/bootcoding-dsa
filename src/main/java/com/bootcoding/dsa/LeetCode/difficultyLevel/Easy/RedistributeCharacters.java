package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

import java.util.HashMap;
import java.util.Map;

public class RedistributeCharacters {

    public static void main(String[] args) {
        RedistributeCharacters solution = new RedistributeCharacters();

        String[] words1 = {"abc", "aabc", "bc"}; // true
        System.out.println(solution.makeEqual(words1));

        String[] words2 = {"ab", "a"}; // false
        System.out.println(solution.makeEqual(words2));
    }
    public boolean makeEqual(String[] words) {
        // Count the frequency of each character
        Map<Character, Integer> charFrequency = new HashMap<>();

        // Count the frequency of each character in all words
        for (String word : words) {
            for (char c : word.toCharArray()) {
                charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
            }
        }

        // Check if the frequency of each character is divisible by the total number of words
        int totalWords = words.length;
        for (int count : charFrequency.values()) {
            if (count % totalWords != 0) {
                return false;
            }
        }

        return true;
    }

}

