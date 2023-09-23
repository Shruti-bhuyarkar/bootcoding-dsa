package com.bootcoding.dsa.LeetCode.LinkedList;

public class AddDigits {
    public static void main(String[] args) {
        int n = 38;
        int a= addDigits(n);
        System.out.println(a);
    }
    public static int addDigits(int num) {
        if (num<10){
            return num;
        }
        return addDigits(num/10 + num%10);

        }
    }

