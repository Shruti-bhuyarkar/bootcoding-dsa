package com.bootcoding.dsa.Recursion;
//count digits
public class CountDigit {
    public static void main(String[] args) {
        int num = 1003;
        System.out.println("Count of digits : " + getcountDigit(num));
    }
    public static int getcountDigit(int num){
            if (num < 10)
                return 1;
            return 1 + getcountDigit(num / 10);

    }
}
