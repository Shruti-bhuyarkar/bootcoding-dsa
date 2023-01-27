package com.bootcoding.dsa.Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] n = {2, 3, 4, 5, 6, 7};
        int x = 5;
        int index = (findBinarySearch(n, x, 0, n.length ));
        System.out.println(x + " is found at " + index);
    }
    public static int findBinarySearch(int[] n , int x, int left, int right){
        int mid = (left + right ) / 2;
        if(x == n[mid])
            return mid;
        if ( left >= right)
            return -1;
        if(x > n[mid])
            return findBinarySearch(n, x, mid + 1 , right);
        else
            return findBinarySearch(n , x, left, mid - 1);
    }
}
