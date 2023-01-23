package Test_Series_1;

public class CountOfDigits {
    public static void main(String[] args) {
        int n = 9495;
        System.out.println(printCountOfDigits(n));
    }
    public static int printCountOfDigits(int n){
        if (n < 10){
            return 1;
        }
        return 1 + printCountOfDigits(n / 10);

    }
}
