package com.bootcoding.dsa.LeetCode.difficultyLevel.Hard;

public class PoorPigs {
    public static void main(String[] args) {
        PoorPigs poorPigs = new PoorPigs();

        // Test cases
        int buckets1 = 1000;
        int minutesToDie1 = 15;
        int minutesToTest1 = 60;
        int result1 = poorPigs.poorPigs(buckets1, minutesToDie1, minutesToTest1);
        System.out.println("Minimum number of pigs needed for Test Case 1: " + result1);

    }
        public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
            int test = minutesToTest / minutesToDie;
            int i = 0;
            while (Math.pow(test + 1, i) < buckets) {
                i++;
            }
            return i;
        }


    }


