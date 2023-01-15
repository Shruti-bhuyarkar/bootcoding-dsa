package com.bootcoding.dsa.Pattern;

public class NumberIncreaseByOne {
    public static void main(String[] args) {
        int i,j,n=6;
        int sum = 1;
        for ( i = 1; i<=n; i++)
        {
            for ( j = 1; j<=i; j++)
            {
                System.out.print(sum+ " ");
                sum ++;
            }
            System.out.println();
        }
    }
}
