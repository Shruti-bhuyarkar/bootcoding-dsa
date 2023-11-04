package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;
import java.util.Arrays;
public class LastMomentBeforeAllAntsFallOutOfPlank {

    public static void main(String[] args) {
        LastMomentBeforeAllAntsFallOutOfPlank lastMomentBeforeAllAntsFallOutOfPlank = new LastMomentBeforeAllAntsFallOutOfPlank();

        // Test the getLastMoment method
        int n = 7;
        int[] left = {0, 2, 4};
        int[] right = {3, 5, 6};

        int lastMoment = lastMomentBeforeAllAntsFallOutOfPlank.getLastMoment(n, left, right);
        System.out.println("Last moment before particles stop moving: " + lastMoment);
    }
        public int getLastMoment(int n, int[] left, int[] right) {
            int maxLeft = left.length == 0 ? 0 : Arrays.stream(left).max().getAsInt();
            int minRight = right.length == 0 ? n : Arrays.stream(right).min().getAsInt();
            return Math.max(maxLeft, n - minRight);
        }


    }


