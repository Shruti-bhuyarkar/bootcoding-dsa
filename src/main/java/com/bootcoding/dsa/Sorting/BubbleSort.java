package com.bootcoding.dsa.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] n = {50, 17, 19, 13, 5};
        findBubbleSort(n);
        print(n);
    }
    public static void findBubbleSort(int[] n) {
        int num = n.length;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - 1; j++) {
                if (n[j] > n[j + 1]) {
                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
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


