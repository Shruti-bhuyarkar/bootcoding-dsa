package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

import java.util.Arrays;

public class WidestVerticalArea {
    public static void main(String[] args) {
        WidestVerticalArea solution = new WidestVerticalArea();
        int[][] points = {
                {8, 7},
                {9, 9},
                {7, 4},
                {9, 7}
        };

        int result = solution.maxWidthOfVerticalArea(points);
        System.out.println("Widest Vertical Area: " + result);
    }
    public int maxWidthOfVerticalArea(int[][] points) {
        int n = points.length;
        int[] xCoordinates = new int[n];

        // Extract x-coordinates from the points and sort them
        for (int i = 0; i < n; i++) {
            xCoordinates[i] = points[i][0];
        }
        Arrays.sort(xCoordinates);

        // Calculate the maximum width between consecutive x-coordinates
        int maxWidth = 0;
        for (int i = 1; i < n; i++) {
            int width = xCoordinates[i] - xCoordinates[i - 1];
            maxWidth = Math.max(maxWidth, width);
        }

        return maxWidth;
    }


}
