package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

public class LargestSubstring {
    public static void main(String[] args) {
        LargestSubstring solution = new LargestSubstring();

        // Example usage
        String s1 = "aa"; // -1 (no substring between two equal characters)
        System.out.println(solution.maxLengthBetweenEqualCharacters(s1));

        String s2 = "abca"; // 1 (substring "b")
        System.out.println(solution.maxLengthBetweenEqualCharacters(s2));

        String s3 = "cabbac"; // 4 (substring "bba")
        System.out.println(solution.maxLengthBetweenEqualCharacters(s3));
    }
        public int maxLengthBetweenEqualCharacters(String s) {
            int ans = -1;
            for (int left = 0; left < s.length(); left++) {
                for (int right = left + 1; right < s.length(); right++) {
                    if (s.charAt(left) == s.charAt(right)) {
                        ans = Math.max(ans, right - left - 1);
                    }
                }
            }

            return ans;
        }
    }


