package com.bootcoding.dsa.LeetCode.Array;

public class FindAddedLetter {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        char addedLetter = findTheDifference(s, t);
        System.out.println("The added letter is: " + addedLetter);
    }
    public static char findTheDifference(String s, String t) {
        int[] count = new int[26];
            for (char ch : s.toCharArray()) {
                count[ch - 'a']--;
            }
            for (char ch : t.toCharArray()) {
                count[ch - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                if (count[i] > 0) {
                    return (char) ('a' + i);
                }
            }
            return ' ';
        }

    }


