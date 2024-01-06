package com.bootcoding.dsa.LeetCode.difficultyLevel.Hard;

import java.util.Arrays;
public class MaxProfitJobScheduling {
    public static void main(String[] args) {
        MaxProfitJobScheduling solution = new MaxProfitJobScheduling();

        int[] startTime = {1, 2, 3, 3};
        int[] endTime = {3, 4, 5, 6};
        int[] profit = {50, 10, 40, 70};

        int result = solution.jobScheduling(startTime, endTime, profit);
        System.out.println("Maximum Profit: " + result);
    }

    static class Job {
        int start, end, profit;

        Job(int start, int end, int profit) {
            this.start = start;
            this.end = end;
            this.profit = profit;
        }
    }
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;

        // Create an array of jobs with their start time, end time, and profit
        Job[] jobs = new Job[n];
        for (int i = 0; i < n; i++) {
            jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
        }

        // Sort jobs based on their end time
        Arrays.sort(jobs, (a, b) -> Integer.compare(a.end, b.end));

        // dp array to store maximum profit at each job
        int[] dp = new int[n];
        dp[0] = jobs[0].profit;

        // Iterate through each job and calculate the maximum profit
        for (int i = 1; i < n; i++) {
            int currentProfit = jobs[i].profit;
            int prevJobIndex = binarySearch(jobs, i);
            if (prevJobIndex != -1) {
                currentProfit += dp[prevJobIndex];
            }

            dp[i] = Math.max(currentProfit, dp[i - 1]);
        }

        return dp[n - 1];
    }

    private int binarySearch(Job[] jobs, int index) {
        int low = 0, high = index - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (jobs[mid].end <= jobs[index].start) {
                if (jobs[mid + 1].end <= jobs[index].start) {
                    low = mid + 1;
                } else {
                    return mid;
                }
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }


}
