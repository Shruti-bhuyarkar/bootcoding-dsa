package com.bootcoding.dsa.Pattern;

public class Number2 {
    public static void main(String[] args) {
        int i,j,n=6;
        for ( i = 1; i<=n; i++)
        {
            for ( j = 1; j<=i; j++)
            {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
