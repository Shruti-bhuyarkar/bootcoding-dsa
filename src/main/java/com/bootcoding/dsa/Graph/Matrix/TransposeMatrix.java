package com.bootcoding.dsa.Graph.Matrix;

public class TransposeMatrix {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;
        int[][] transposematrix = transposematrix(arr);
        System.out.println("Original Matrix:");
        printMatrix(arr);
        System.out.println("Transposed Matrix:");
           printMatrix(transposematrix);
    }


    private static int[][] transposematrix(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        int[][] transposematrix = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transposematrix[j][i]=arr[i][j];
            }
        }
        return transposematrix;
    }
    private static void printMatrix(int[][] arr) {
        for (int[] row : arr) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}



