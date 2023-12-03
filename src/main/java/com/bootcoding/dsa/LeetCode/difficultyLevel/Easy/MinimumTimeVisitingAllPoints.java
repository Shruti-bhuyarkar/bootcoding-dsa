package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

public class MinimumTimeVisitingAllPoints {

    public static void main(String[] args) {
        MinimumTimeVisitingAllPoints solution = new MinimumTimeVisitingAllPoints();

        int[][] points = {{1, 1}, {3, 4}, {-1, 0}};
        int result = solution.minTimeToVisitAllPoints(points);

        System.out.println("Minimum time to visit all points: " + result);
    }
    public int minTimeToVisitAllPoints(int[][] points) {
        int minTime = 0;

        for (int i = 1; i < points.length; i++) {
            int[] current = points[i - 1];
            int[] next = points[i];

            int verticalDiff = Math.abs(next[1] - current[1]);
            int horizontalDiff = Math.abs(next[0] - current[0]);

            // Calculate the time required to move diagonally
            int diagonalTime = Math.min(verticalDiff, horizontalDiff);

            // Calculate the time required to move vertically or horizontally
            int straightTime = Math.abs(verticalDiff - horizontalDiff);

            // Update the total minimum time
            minTime += diagonalTime + straightTime;
        }

        return minTime;
    }

}
