package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

public class PeakIndex {
    public static void main(String[] args) {
        //int[] arr = {0, 2, 1, 0};
        int[] arr = {0, 10, 5, 2};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static  int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while(low < high){
            //int mid = (low + high)/2 -- overflow the integer
            int mid = low + (high - low) / 2;
            if(arr[mid] < arr[mid + 1]){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        return low;
    }
}
