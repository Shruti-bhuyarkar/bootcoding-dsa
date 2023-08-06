package com.bootcoding.dsa.Graph.Matrix;

public class CountNegativeElement {
    public static void main(String[] args) {
        int[][] matrix = {
                {-4, -3, -1, 1},
                {-2, -2,  1, 2},
                {-1,  1,  2, 3},
                { 1,  2,  4, 5}
        };

        int negativeCount = countNegatives(matrix);
        System.out.println("Number of negative numbers in the sorted matrix: " + negativeCount);
    }
    public static int countNegatives(int[][] grid) {
//        int rows = grid.length;
//        int cols = grid[0].length;
//        int count = 0;
//        int row = 0;
//        int col = cols - 1;
//        while (row < rows && col >= 0) {
//            if (grid[row][col] < 0) {
//                count += rows - row;
//                col--;
//            } else {
//                row++;
//            }
//        }
//        return count;
        int count = 0;

        for (int[] row : grid) {
            for (int num : row) {
                if (num < 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
