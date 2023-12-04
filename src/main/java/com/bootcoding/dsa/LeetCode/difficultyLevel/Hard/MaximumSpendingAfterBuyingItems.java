package com.bootcoding.dsa.LeetCode.difficultyLevel.Hard;

import java.util.Arrays;

public class MaximumSpendingAfterBuyingItems {
    public static void main(String[] args) {
        MaximumSpendingAfterBuyingItems solution = new MaximumSpendingAfterBuyingItems();

        int[][] values = {
                {4, 2, 1},
                {7, 3, 5},
                {6, 8, 2}
        };

        long result = solution.maxSpending(values);
        System.out.println("Maximum spending: " + result);
    }

        public long maxSpending(int[][] values) {
            int m=values.length;
            int n = values[0].length;
            long a[]= new long[m*n];
            int k=0;
            long ans=0;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    a[k++]=values[i][j];
                }
            }
            Arrays.sort(a);
            int x=1;
            for(int i=0;i<a.length;i++){
                ans+=a[i]*x++;
            }
            return ans;
        }

}
