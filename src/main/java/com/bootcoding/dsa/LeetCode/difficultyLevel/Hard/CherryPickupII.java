package com.bootcoding.dsa.LeetCode.difficultyLevel.Hard;

public class CherryPickupII {

        public static void main(String[] args) {
            CherryPickupII cherryPickupII = new CherryPickupII();

            // Example grid
            int[][] grid = {
                    {0, 8, 7, 10, 9, 10, 0, 9, 6},
                    {8, 7, 10, 8, 7, 4, 9, 6, 10},
                    {8, 1, 1, 5, 1, 5, 5, 1, 2},
                    {9, 4, 10, 8, 8, 1, 9, 5, 0}
            };

            int result = cherryPickupII.cherryPickup(grid);
            System.out.println("Maximum cherries collected: " + result);
        }
       public int cherryPickup(int[][] grid) {
            int rows = grid.length;
            int cols = grid[0].length;

            // Create a 3D array to store the results of subproblems
            int[][][] dp = new int[rows][cols][cols];

            // Iterate through each row from bottom to top
            for (int i = rows - 1; i >= 0; i--) {
                for (int j1 = 0; j1 < cols; j1++) {
                    for (int j2 = 0; j2 < cols; j2++) {
                        int cherries = grid[i][j1];

                        // If both robots are not in the same column, add cherries for robot 2
                        if (j1 != j2) {
                            cherries += grid[i][j2];
                        }

                        // Transition to the next row
                        if (i != rows - 1) {
                            int max = 0;

                            // Iterate through all possible moves for both robots
                            for (int move1 = j1 - 1; move1 <= j1 + 1; move1++) {
                                for (int move2 = j2 - 1; move2 <= j2 + 1; move2++) {
                                    if (move1 >= 0 && move1 < cols && move2 >= 0 && move2 < cols) {
                                        max = Math.max(max, dp[i + 1][move1][move2]);
                                    }
                                }
                            }

                            cherries += max;
                        }

                        dp[i][j1][j2] = cherries;
                    }
                }
            }

            return dp[0][0][cols - 1];
        }


}


