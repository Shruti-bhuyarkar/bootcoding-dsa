package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

public class CountBeautifulSubstringsI {
    public static void main(String[] args) {
        CountBeautifulSubstringsI solution = new CountBeautifulSubstringsI();

        String s = "abcabc";
        int k = 2;
        int result = solution.beautifulSubstrings(s, k);

        System.out.println("Number of beautiful substrings: " + result);
    }

    public int beautifulSubstrings(String s, int k) {
        int len = s.length();
        int ans = 0;
        for (int i = 0; i < len; i++) {
            int count = 0, count1 = 0;
            for (int j = i; j < len; j++) {
                char c = s.charAt(j);
                if (c == 'a' || c == 'e' || c == 'o' || c == 'i' || c == 'u') {
                    count++;
                } else {
                    count1++;
                }
                if (count == count1 && (count * count1) % k == 0) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
