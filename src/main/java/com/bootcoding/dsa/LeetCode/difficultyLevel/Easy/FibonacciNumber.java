package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

import java.util.HashMap;

public class FibonacciNumber {
    static HashMap<Integer, Integer> cache = new HashMap<>();
    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(fib(25));
        System.out.println("Total time in (ns) " + (System.nanoTime() - start));
        long start2 = System.nanoTime();
        System.out.println(fibmemoiztion(25));
        System.out.println("Total time (memoization) " + (System.nanoTime() - start2));
    }
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
    public static int fibmemoiztion(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        cache.put(n, fibmemoiztion(n - 1) + fibmemoiztion(n - 2));
        return cache.get(n);
    }
}
