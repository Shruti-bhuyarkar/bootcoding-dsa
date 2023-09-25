package com.bootcoding.dsa.Graph.Matrix;

public class FindElement {
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

        findele(arr, 9);
    }
       private static  void findele(int[][] arr, int data){
           for(int i=0; i< arr.length; i++){
               for(int j=0; j< arr.length; j++){
                   if (data == arr[i][j]){
                       System.out.print("element  " + arr[i][j] + " arr1  " + i + " arr2 " + j );
                   }
               }
           }
        }
}
