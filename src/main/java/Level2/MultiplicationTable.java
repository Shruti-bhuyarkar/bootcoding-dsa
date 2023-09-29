package Level2;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt();
        System.out.println("Multiplication Table ! ");
        findMultiplicationTable(number);
        }
        public static void findMultiplicationTable(int number){
        int num = number;
        int Mul = 0;
        for (int i = 1; i<=10; i++){
            Mul = num * i;
            System.out.println(num + " X " + i + " = " + Mul );
        }
        }
    }

