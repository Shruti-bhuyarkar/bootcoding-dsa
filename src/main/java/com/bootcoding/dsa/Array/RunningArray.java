package com.bootcoding.dsa.Array;

public class RunningArray {
    public static void main(String[] args) {
        RunningArray runningArray = new RunningArray();
        int[] nums = {1,2,3,4};
        int[] res = runningArray.runningSum(nums);
        for (int i =0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
    public int[] runningSum(int[] nums) {
        int a[] = new int[nums.length];
        for(int i = 0; i<nums.length;i++){
            int sum = 0;
            for(int j = 0;j<=i;j++){
                sum += nums[j];
            }
            a[i] = sum;
        }
        return a;
    }
}
