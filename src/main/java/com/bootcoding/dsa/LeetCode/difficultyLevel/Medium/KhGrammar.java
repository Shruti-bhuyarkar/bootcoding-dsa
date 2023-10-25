package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

public class KhGrammar {
    public static void main(String[] args) {
        KhGrammar khGrammar = new KhGrammar();

        // Test cases
        int n1 = 1;
        int k1 = 1;
        int result = khGrammar.kthGrammar(n1, k1);
        System.out.println("kthGrammar(" + n1 + ", " + k1 + ") = " + result);


    }
        public int kthGrammar(int n, int k) {
            if (n == 1)
                return 0;

            int length = 1 << (n - 2);
            if (k <= length)
                return kthGrammar(n - 1, k);
            else
                return 1 - kthGrammar(n - 1, k - length);
        }


    }

