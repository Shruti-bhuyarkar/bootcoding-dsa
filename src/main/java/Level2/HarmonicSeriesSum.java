package Level2;

import java.util.Scanner;

public class HarmonicSeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int Number = sc.nextInt();

        printHarmonicSeriesSum(Number);
    }
    public static void printHarmonicSeriesSum(int Number){
        float Sum = 0;
        for (float i = 1; i<=Number; i++){
            System.out.print(" 1/" + i + " + ");
            Sum = Sum + (1 / i);
        }
        System.out.println(" Sum of Series upto " + Number + " Terms : " + Sum);
    }
}
