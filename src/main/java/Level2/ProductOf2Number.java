package Level2;

import java.util.Scanner;

public class ProductOf2Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number = ");
        int A = sc.nextInt();
        System.out.println("Enter Second Number = ");
        int B = sc.nextInt();

        printProductOf2Numbers(A,B);
    }
    public static void printProductOf2Numbers(int A , int B){
        int num1 = A;
        int num2 = B;
        int Product = A * B;
        System.out.println("Product of Two Numbers = " + Product);
            }
}
