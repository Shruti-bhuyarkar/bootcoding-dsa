package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

public class LaserBeamsInBank {
    public static void main(String[] args) {
        LaserBeamsInBank solution = new LaserBeamsInBank();

        String[] bank = {"000", "100", "110"};
        int result = solution.numberOfBeams(bank);
        System.out.println("Total number of laser beams: " + result);
    }
        public int numberOfBeams(String[] bank) {
            int prevRowCount = 0;
            int total=0;

            for(String row : bank) {
                int curRowCount = calc(row);
                if(curRowCount==0)
                    continue;

                total += curRowCount * prevRowCount;
                prevRowCount = curRowCount;
            }
            return total;
        }

        private int calc(String s) {
            int count = 0;
            for(char c : s.toCharArray())
                count += c - '0';

            return count;
        }
    }

