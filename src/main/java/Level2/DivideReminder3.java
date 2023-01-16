package Level2;

import java.util.Scanner;

public class DivideReminder3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println(" Enter Num : ");
        int Num = sc.nextInt();

        findReminder3(Num);
    }
    public static void findReminder3(int Num){
        for (int i = 1; i<=100; i++){
            if(i % Num == 3){
                System.out.println(i);
            }
        }
    }
}
