package com.bootcoding.dsa.LeetCode.Array;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();

        String s1 = "ab#c";
        String t1 = "ad#c";
        boolean result1 = backspaceStringCompare.backspaceCompare(s1, t1);
        System.out.println("Result 1: " + result1); // Should be true

        String s2 = "ab##";
        String t2 = "c#d#";
        boolean result2 = backspaceStringCompare.backspaceCompare(s2, t2);
        System.out.println("Result 2: " + result2); // Should be true

        String s3 = "a##c";
        String t3 = "#a#c";
        boolean result3 = backspaceStringCompare.backspaceCompare(s3, t3);
        System.out.println("Result 3: " + result3); // Should be true

        String s4 = "a#c";
        String t4 = "b";
        boolean result4 = backspaceStringCompare.backspaceCompare(s4, t4);
        System.out.println("Result 4: " + result4); // Should be false
    }
        public boolean backspaceCompare(String s, String t) {
            return buildString(s).equals(buildString(t));
        }

        private String buildString(String str) {
            StringBuilder result = new StringBuilder();
            int backspaceCount = 0;

            for (int i = str.length() - 1; i >= 0; i--) {
                char c = str.charAt(i);

                if (c == '#') {
                    backspaceCount++;
                } else if (backspaceCount > 0) {
                    backspaceCount--;
                } else {
                    result.append(c);
                }
            }

            return result.toString();
        }


    }


