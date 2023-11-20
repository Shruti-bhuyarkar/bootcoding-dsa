package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

public class MinimumAmountofTimetoCollectGarbage {
    public static void main(String[] args) {
        MinimumAmountofTimetoCollectGarbage m = new MinimumAmountofTimetoCollectGarbage();

        // Example usage
        String[] garbage = {"G", "PP", "MMM"};
        int[] travel = {2, 3};
        int result = m.garbageCollection(garbage, travel);

        System.out.println("Total time spent on garbage collection: " + result);
    }
        boolean hasG = false, hasP = false, hasM = false;

        public int garbageCollection(String[] garbage, int[] travel) {
            int n = garbage.length;
            int ans = 0;
            for (int i = 0; i < n - 1; i++) {
                ans += 3 * travel[i];
            }
            for (String s : garbage) {
                ans += s.length();
            }
            for (int i = n - 1; i > 0; i--) {
                if (!garbage[i].contains("G")) {
                    ans -= travel[i - 1];
                } else {
                    break;
                }
            }
            for (int i = n - 1; i > 0; i--) {
                if (!garbage[i].contains("P")) {
                    ans -= travel[i - 1];
                } else {
                    break;
                }
            }
            for (int i = n - 1; i > 0; i--) {
                if (!garbage[i].contains("M")) {
                    ans -= travel[i - 1];
                } else {
                    break;
                }
            }
            return ans;
        }


    }


