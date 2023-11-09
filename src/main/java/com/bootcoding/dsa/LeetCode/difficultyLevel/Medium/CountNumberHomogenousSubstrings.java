package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

public class CountNumberHomogenousSubstrings {
    public static void main(String[] args) {
        CountNumberHomogenousSubstrings countNumberHomogenousSubstrings = new CountNumberHomogenousSubstrings();

        // Example usage:
        String input = "abbcccaa";
        int homogenousCount = countNumberHomogenousSubstrings.countHomogenous(input);

        System.out.println("The number of homogenous substrings is: " + homogenousCount);
    }
        public int countHomogenous(String s) {
            long res = 0;
            char[] c = s.toCharArray();
            int start = 0;

            for (int i = 0; i < c.length; i++) {
                if (c[i] != c[start]) {
                    int appear = i - start;
                    while (appear > 0) {
                        res += appear;
                        appear -= 1;
                    }
                    start = i;
                }
            }

            int appear = c.length - start;
            while (appear > 0) {
                res += appear;
                appear -= 1;
            }

            return (int) (res % (Math.pow(10, 9) + 7));
        }


    }


