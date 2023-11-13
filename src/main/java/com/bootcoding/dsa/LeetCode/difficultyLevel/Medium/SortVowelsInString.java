package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortVowelsInString {

    public static void main(String[] args) {
        // Example usage:
        SortVowelsInString sortVowelsInString = new SortVowelsInString();
        String s = "leetcode";
        String result = sortVowelsInString.sortVowels(s);
        System.out.println("Result: " + result);
    }
        public String sortVowels(String s) {
            char[] chars = s.toCharArray();
            int n = chars.length;

            // Extract and sort vowels
            List<Character> vowels = new ArrayList<>();
            for (char c : chars) {
                if (isVowel(c)) {
                    vowels.add(c);
                }
            }
            Collections.sort(vowels);

            // Place sorted vowels back into the original string
            int vowelIndex = 0;
            for (int i = 0; i < n; i++) {
                if (isVowel(chars[i])) {
                    chars[i] = vowels.get(vowelIndex++);
                }
            }

            return new String(chars);
        }

        private boolean isVowel(char c) {
            return "aeiouAEIOU".indexOf(c) != -1;
        }

    }
