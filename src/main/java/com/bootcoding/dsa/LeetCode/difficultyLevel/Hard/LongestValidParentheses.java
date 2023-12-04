package com.bootcoding.dsa.LeetCode.difficultyLevel.Hard;

import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
        LongestValidParentheses solution = new LongestValidParentheses();

        String s1 = "(()";
        int result1 = solution.longestValidParentheses(s1);
        System.out.println("Longest valid parentheses for " + s1 + ": " + result1);

        String s2 = ")()())";
        int result2 = solution.longestValidParentheses(s2);
        System.out.println("Longest valid parentheses for " + s2 + ": " + result2);
    }

        public int longestValidParentheses(String s) {
            Stack<Integer> st = new Stack<>();
            int ans = 0;
            st.push(-1);
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='('){
                    st.push(i);
                }else if(s.charAt(i)==')'){
                    st.pop();
                    if(st.isEmpty()){
                        st.push(i);
                    }else{
                        ans = Math.max(ans,i-st.peek());
                    }
                }
            }
            return ans;
        }
    }

