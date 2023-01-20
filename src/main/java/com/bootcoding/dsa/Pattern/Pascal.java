package com.bootcoding.dsa.Pattern;

public class Pascal {
    public static void main(String[] args) {
    printPascalPattern();
    }
    public static void printPascalPattern(){
        int n = 5;
        int res = 0;
        int count = 1;
        for (int i =0 ; i<n; i++){
            for (int j = n-i; j>=1; j--){
                System.out.print(" ");
            }
            for (int k = 0; k<=i; k++){
                res = res + 1;
                if (k == 0 || k == i){
                    count = 1;
                }
                else {
                    count = count * (i - k + 1)/k;
                }
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}