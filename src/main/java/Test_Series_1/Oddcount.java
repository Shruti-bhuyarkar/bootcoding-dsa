package Test_Series_1;

public class Oddcount {
    public static void main(String[] args) {
        int[] n = {555, 901, 483, 1771};
        System.out.println(oddDigits(n));

    }

    public static int oddDigits(int[] n) {
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            if (i % 3 == 0) {
                count = count + 1;
            }
        }
        return count;
    }
}

