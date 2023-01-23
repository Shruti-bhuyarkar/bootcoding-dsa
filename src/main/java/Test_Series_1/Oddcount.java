package Test_Series_1;

public class Oddcount {
    public static void main(String[] args) {
        int[] n = {555, 901, 483, 1771};
        System.out.println(oddDigits(n));

    }

    public static int oddDigits(int[] n) {
        int oddCounter = 0;
        int div;
        for (int i = 0; i < n.length; i++) {
            int digitsCounter = 0;
            int num = n[i];
            while ( num != 0){
                div = num / 10;
                num = div;
                digitsCounter++;
            }
            if (digitsCounter % 3 == 0) {
               oddCounter++;
            }
        }
        return oddCounter;
    }
}

