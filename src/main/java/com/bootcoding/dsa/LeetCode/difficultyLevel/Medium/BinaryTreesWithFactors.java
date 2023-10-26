package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class BinaryTreesWithFactors {

    public static void main(String[] args) {
        BinaryTreesWithFactors binaryTreesWithFactors = new BinaryTreesWithFactors();
        int[] factors = {2, 4, 5, 10};
        int result = binaryTreesWithFactors.numFactoredBinaryTrees(factors);
        System.out.println("Number of binary trees that can be formed: " + result);
    }
        public int numFactoredBinaryTrees(int[] arr) {
            int mod = 1000000007;
            Arrays.sort(arr);
            Map<Integer, Long> dp = new HashMap<>();

            for (int a : arr) {
                dp.put(a, 1L);

                for (int b : arr) {
                    if (b >= a) {
                        break;
                    }

                    if (a % b == 0 && dp.containsKey(a / b)) {
                        dp.put(a, (dp.get(a) + dp.get(b) * dp.get(a / b)) % mod);
                    }
                }
            }

            long result = 0;
            for (long count : dp.values()) {
                result = (result + count) % mod;
            }

            return (int) result;
        }

    }



