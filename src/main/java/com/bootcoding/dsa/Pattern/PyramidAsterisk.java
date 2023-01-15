package com.bootcoding.dsa.Pattern;

public class PyramidAsterisk {
    public static void main(String[] args) {
        int i, j, k, n = 6;
        //int sum = 1;
        for (i = 0; i < n; i++) {
            for (j = n - i; j > 1; j--) {
                System.out.print(" ");
                // sum ++;
            }
            for (k = 1; k <= i; k++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
