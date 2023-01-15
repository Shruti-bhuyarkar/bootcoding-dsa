package Level2;

import java.util.Scanner;

public class PrintSMSDR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter first Digit ");
        int A = sc.nextInt();
        System.out.println("Enter Second Digit ");
        int B = sc.nextInt();

        printSMSDR(A,B);
    }
    public static void printSMSDR(int A, int B){
        int ADD = A + B;
        int MUL = A * B;
        int SUB = A - B;
        int DIV = A / B;
        int REM = A % B;

        System.out.println("Addition  is " + ADD);
        System.out.println("Multiplication is " +MUL);
        System.out.println("Substraction is " + SUB);
        System.out.println("Division is " + DIV);
        System.out.println("Reminder is " + REM);
    }
}
