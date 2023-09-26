package com.bootcoding.dsa.Array;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static List<String> generateParentheses(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }
    private static void backtrack(List<String> ans, String currStr, int openCount, int closeCount, int maxPairs) {
        if (currStr.length() == maxPairs * 2) {
            ans.add(currStr);
            return;
        }
        if (openCount < maxPairs) {
            backtrack(ans, currStr + "(", openCount + 1, closeCount, maxPairs);
        }
        if (closeCount < openCount) {
            backtrack(ans, currStr + ")", openCount, closeCount + 1, maxPairs);
        }
    }
    public static void main(String[] args) {
        List<String> result = generateParentheses(3);
        for (String s : result) {
            System.out.println(s);
        }
    }
}

