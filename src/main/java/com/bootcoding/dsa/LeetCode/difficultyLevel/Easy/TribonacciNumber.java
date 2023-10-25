package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

import java.util.HashMap;

public class TribonacciNumber {
    public static void main(String[] args) {
        System.out.println(tribonacci(4));
    }
    static HashMap<Integer, Integer> index = new HashMap<>();
    public static int tribonacci(int n) {
        if(n == 0)
            return 0;
        if(n == 1 || n == 2)
            return 1;
        if (index.containsKey(n))
            return index.get(n);
        index.put(n, tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3));
            return index.get(n);
        }
    }

