package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;
//Difference Between Ones and Zeros in Row and Column
public class OneMinusZero {
    public static void main(String[] args) {
        OneMinusZero solution = new OneMinusZero();

        int[][] grid = {
                {1, 0, 1},
                {0, 1, 0},
                {1, 0, 1}
        };

        int[][] result = solution.differenceMatrix(grid);

        // Print the difference matrix
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
        public int[][] differenceMatrix(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;

            int[][] diff = new int[m][n];

            int[] onesRow = new int[m];
            int[] zerosRow = new int[m];
            int[] onesCol = new int[n];
            int[] zerosCol = new int[n];

            // Calculate the number of ones and zeros in each row and column
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    onesRow[i] += grid[i][j];
                    onesCol[j] += grid[i][j];
                    zerosRow[i] += 1 - grid[i][j];
                    zerosCol[j] += 1 - grid[i][j];
                }
            }

            // Calculate the difference matrix
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    diff[i][j] = onesRow[i] + onesCol[j] - zerosRow[i] - zerosCol[j];
                }
            }

            return diff;
        }


    }


