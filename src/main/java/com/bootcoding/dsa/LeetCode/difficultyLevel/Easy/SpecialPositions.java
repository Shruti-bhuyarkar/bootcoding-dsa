package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;
// Special Positions in a Binary Matrix
public class SpecialPositions {
    public static void main(String[] args) {
        SpecialPositions solution = new SpecialPositions();

        int[][] mat = {
                {1, 0, 0},
                {0, 0, 1},
                {1, 0, 0}
        };

        int result = solution.numSpecial(mat);

        System.out.println("Number of special positions: " + result);
    }
        public int numSpecial(int[][] mat) {
            int m = mat.length;
            int n = mat[0].length;
            int count = 0;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (mat[i][j] == 1 && isSpecial(mat, i, j)) {
                        count++;
                    }
                }
            }

            return count;
        }

        private boolean isSpecial(int[][] mat, int row, int col) {
            // Check if all other elements in the same row are 0
            for (int j = 0; j < mat[0].length; j++) {
                if (j != col && mat[row][j] == 1) {
                    return false;
                }
            }

            // Check if all other elements in the same column are 0
            for (int i = 0; i < mat.length; i++) {
                if (i != row && mat[i][col] == 1) {
                    return false;
                }
            }

            return true;
        }


    }
