package com.bootcoding.dsa.Recursion;

public class PowerOf2 {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n ) {
        if(n<1){
            return false;
        }
        else if(n == 1) {
            return true;
        }
       else if(n % 2 == 1){
            return false;
        }
        return isPowerOfTwo(n/2);
    }
}
