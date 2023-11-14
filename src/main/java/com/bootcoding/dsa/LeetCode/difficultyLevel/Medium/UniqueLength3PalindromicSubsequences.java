package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

import java.util.HashSet;
import java.util.Set;

public class UniqueLength3PalindromicSubsequences {

    public static void main(String[] args) {
        UniqueLength3PalindromicSubsequences solution = new UniqueLength3PalindromicSubsequences();
        String input = "abca";
        int result = solution.countPalindromicSubsequence(input);
        System.out.println("Result: " + result);
    }
        public int countPalindromicSubsequence(String s) {
            int res = 0;
            Set<Character> uniq = new HashSet<>();

            for (char c : s.toCharArray()) {
                uniq.add(c);
            }
            for (char c : uniq) {
                int start = s.indexOf(c);
                int end = s.lastIndexOf(c);

                if (start < end) {
                    Set<Character> charSet = new HashSet<>();
                    for (int i = start + 1; i < end; i++) {
                        charSet.add(s.charAt(i));
                    }
                    res += charSet.size();
                }
            }
            return res;
        }
    }

