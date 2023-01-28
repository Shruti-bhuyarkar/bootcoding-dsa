package com.bootcoding.dsa.Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] n = {62, 33, 3, 12, 10};
        findInsertionSort(n);
        print(n);
    }
    public static void findInsertionSort(int[] n){
        int nums = n.length;
        for (int i = 1; i<nums; i++){
            for (int j = 0; j < nums; j++){
                if(n[i] < n[j]){
                    int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
    }
    public static void print( int[] n){
        int num = n.length;
        for (int i = 0; i < num; ++i) {
            System.out.println(n[i] + " ");
        }
        System.out.println();
    }
}
