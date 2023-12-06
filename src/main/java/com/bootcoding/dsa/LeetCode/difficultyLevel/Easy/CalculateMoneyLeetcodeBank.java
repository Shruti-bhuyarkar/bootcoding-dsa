package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

public class CalculateMoneyLeetcodeBank {
    public static void main(String[] args) {
        CalculateMoneyLeetcodeBank solution = new CalculateMoneyLeetcodeBank();

        int n = 10;
        int result = solution.totalMoney(n);

        System.out.println("Total amount of money at the end of day " + n + ": $" + result);
    }

    public int totalMoney(int n) {
        int totalMoney = 0;
        int currentDay = 1;
        int currentWeek = 1;
        int dailyAmount = 1;

        while (currentDay <= n) {
            totalMoney += dailyAmount;
            dailyAmount++;

            if (currentDay % 7 == 0) {
                // If it's a Monday, reset the daily amount and increase the week
                dailyAmount = currentWeek + 1;
                currentWeek++;
            }

            currentDay++;
        }

        return totalMoney;
    }
}
