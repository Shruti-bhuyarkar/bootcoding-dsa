package com.bootcoding.dsa.Graph.Matrix;

public class SparseMatrix {
    public static void main(String[] args) {

    }

}



















//
//    public static int[][] createSparseMatrix(int rows, int cols, double sparsityThreshold) {
//        int[][] matrix = new int[rows][cols];
//        Random random = new Random();
//
//        // Set some elements to zero to create a sparse matrix
//        int numZeros = (int) (sparsityThreshold * rows * cols);
//        for (int i = 0; i < numZeros; i++) {
//            int rowIdx = random.nextInt(rows);
//            int colIdx = random.nextInt(cols);
//            matrix[rowIdx][colIdx] = 0;
//        }
//
//        return matrix;
//    }
//
//    public static boolean isSparse(int[][] matrix, double sparsityThreshold) {
//        int rows = matrix.length;
//        int cols = matrix[0].length;
//        int totalElements = rows * cols;
//        int zeroCount = 0;
//
//        // Count the number of zero elements in the matrix
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                if (matrix[i][j] == 0) {
//                    zeroCount++;
//                }
//            }
//        }
//
//        // Calculate the ratio of zero elements to the total number of elements
//        double zeroRatio = (double) zeroCount / totalElements;
//
//        // Check if the matrix is sparse based on the threshold
//        return zeroRatio > sparsityThreshold;
//    }
//
//    public static void main(String[] args) {
//        int rows = 5;
//        int cols = 5;
//        double sparsityThreshold = 0.6;
//
//        int[][] matrix = createSparseMatrix(rows, cols, sparsityThreshold);
//        System.out.println("Generated matrix:");
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        if (isSparse(matrix, sparsityThreshold)) {
//            System.out.println("The matrix is sparse.");
//        } else {
//            System.out.println("The matrix is not sparse.");
//        }
//    }
//}
