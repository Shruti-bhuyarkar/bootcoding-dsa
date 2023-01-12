package com.bootcoding.dsa.Array;
// WAP to return square of array element using method
public class ReturnSquare {
    public static void main(String[] args) {

        int[] num = {2, 3};
        int[] result =  ReturnSquare(num);
        for(int i = 0; i< result.length; i++){
            System.out.println(result[i]);
        }
    }
    public static int[] ReturnSquare ( int[] digits) {
            for (int i = 0; i < digits.length; i++) {
                digits[i] = digits[i] * digits[i];

            }
            return digits;
        }
}

