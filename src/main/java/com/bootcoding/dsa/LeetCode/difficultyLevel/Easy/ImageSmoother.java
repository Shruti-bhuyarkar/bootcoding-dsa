package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

public class ImageSmoother {
    public static void main(String[] args) {
        ImageSmoother smoother = new ImageSmoother();
        int[][] inputImage = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        int[][] smoothedImage = smoother.imageSmoother(inputImage);

        // Print the smoothed image
        for (int[] row : smoothedImage) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
    public int[][] imageSmoother(int[][] M) {
        int rows = M.length;
        int cols = M[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = smoothCell(M, i, j, rows, cols);
            }
        }

        return result;
    }

    private int smoothCell(int[][] M, int row, int col, int rows, int cols) {
        int sum = 0;
        int count = 0;

        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (isValidCell(i, j, rows, cols)) {
                    sum += M[i][j];
                    count++;
                }
            }
        }

        return sum / count;
    }

    private boolean isValidCell(int row, int col, int rows, int cols) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }


}

