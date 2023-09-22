package com.bootcoding.dsa.LeetCode.Array;

import java.util.Arrays;
import java.util.HashMap;

public class SortThePeople {
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] height = {180,165,170};
        System.out.println(sortPeople(names,height));
    }
    public static String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> idx = new HashMap<>();
        String[] name = new String[names.length];
        for(int i = 0;i<names.length;i++){
            idx.put(heights[i], names[i] );
        }
        Arrays.sort(heights);
        int k = 0;
        for(int i = heights.length - 1; i >= 0 ; i--){
            name[k++] = idx.get(heights[i]);
        }
        return name;
    }

}
