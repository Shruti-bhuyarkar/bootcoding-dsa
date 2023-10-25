package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

public class ReverseWordsInSentence {
    public static void main(String[] args) {
        String input = "Hello World";
        String reversed = reverseWords(input);
        System.out.println(reversed); // Output: "olleH dlroW"
    }
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            result.append(reversedWord).append(" ");
        }
        return result.toString().trim();
    }
}

