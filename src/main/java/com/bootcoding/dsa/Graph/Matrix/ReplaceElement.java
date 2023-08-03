package com.bootcoding.dsa.Graph.Matrix;

public class ReplaceElement {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 0;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 0;
        arr[2][1] = 8;
        arr[2][2] = 9;
        System.out.println("Original Matrix:");
        printMatrix(arr);
        replaceElement(arr, 1, 2, 10);
        System.out.println("Matrix after replacing element at (1, 1) with 10:");
        printMatrix(arr);
    }
    public static void replaceElement(int[][]arr , int row, int col, int newValue) {
       arr[row][col] = newValue;
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}