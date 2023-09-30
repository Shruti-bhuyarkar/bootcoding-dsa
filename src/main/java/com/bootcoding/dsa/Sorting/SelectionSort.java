package com.bootcoding.dsa.Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] n = {-1, 50, 3, 9, 8};
        selectionSort(n);
        print(n);
    }
    public static void selectionSort(int[] n) {
        int num = n.length;
        for (int i = 0; i < num; i++) {
            int Mi = i;
            for (int j = i + 1; j < num; j++) {
                if (n[j] < n[Mi]) {
                    Mi = j;
                }
            }
            //if min idx is not equal to i then swap
            //otherwise do not swap
            //below if condition tells that
            if (Mi != i) {
                int temp = n[Mi];
                n[Mi] = n[i];
                n[i] = temp;
            }
        }
    }
    public static void print(int[] n) {
        int num = n.length;
        for (int i = 0; i < num; ++i) {
            System.out.println(n[i] + " ");
        }
        System.out.println();
    }
}
