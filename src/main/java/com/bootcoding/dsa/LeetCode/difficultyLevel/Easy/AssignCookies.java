package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        AssignCookies solution = new AssignCookies();

        int[] greedFactors = {1, 2, 3};
        int[] cookieSizes = {1, 1};

        int result = solution.findContentChildren(greedFactors, cookieSizes);
        System.out.println("Maximum number of content children: " + result);
    }
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int contentChildren = 0;
        int i = 0; // Index for greed factors
        int j = 0; // Index for cookie sizes

        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                // If the current cookie size is sufficient for the current child's greed factor
                contentChildren++;
                i++; // Move to the next child
            }
            j++; // Move to the next cookie, whether or not it was assigned
        }

        return contentChildren;
    }


}
