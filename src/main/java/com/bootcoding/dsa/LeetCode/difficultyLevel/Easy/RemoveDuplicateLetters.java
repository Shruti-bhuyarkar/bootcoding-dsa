package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

import java.util.Stack;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        String s = "bcabc";
        String result = removeDuplicateLetters(s);
        System.out.println(result); // Output: "abc"
    }
    public static String removeDuplicateLetters(String s) {
        int[] count = new int[26]; // Count of each character in the string
        boolean[] inStack = new boolean[26]; // To track if a character is in the stack
        Stack<Character> stack = new Stack<>();
        // Count the occurrences of each character in the string
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : s.toCharArray()) {
            count[c - 'a']--; // Decrement the count of the current character
            // Skip characters already in the stack
            if (inStack[c - 'a']) {
                continue;
            }
            // Remove characters from the stack if they are greater and still have occurrences later
            while (!stack.isEmpty() && c < stack.peek() && count[stack.peek() - 'a'] > 0) {
                inStack[stack.pop() - 'a'] = false;
            }
            // Push the current character onto the stack
            stack.push(c);
            inStack[c - 'a'] = true;
        }
        // Build the result string from the stack
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }
        return result.toString();
    }
}

