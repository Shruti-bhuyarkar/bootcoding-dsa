package Test_Series_1;

public class OddPattern {
    public static void main(String args[]) {
        int row = 4;
        int odd = 1;
        for (int i = 1 ; i <= row; i++){
            for (int j = row-i; j>0; j--){
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                odd = odd + 2;
                System.out.print("  "+odd);
            }
            System.out.println();
        }
    }
}
