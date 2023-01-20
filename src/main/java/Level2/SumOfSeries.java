package Level2;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number = ");
        int n = sc.nextInt();
        printSumOfSeries(n);
    }
    public static void printSumOfSeries(int n){
        int sum = 0;
        int temp = n;
        while (n >= 1){
            int div = n/10;
            sum =sum +  n%10;
            n= div;
        }
        System.out.println(sum);
    }
}
