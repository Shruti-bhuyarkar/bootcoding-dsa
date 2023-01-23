package Test_Series_1;

import com.bootcoding.dsa.LinkedList.Node;

public class Maxelement {
    public static void main(String[] args) {
        int[] array = {1,2,5,6};
        int max = array[0];
        int val = printMaxelement(array,max,0);
        System.out.println(val);
    }
    public static int printMaxelement(int[] array , int max, int i){
        if (i == array.length){
            return max;
        }
        if (array[i] > max){
            max = array[i];
        }
        return printMaxelement(array, max, ++i);
    }
    }

