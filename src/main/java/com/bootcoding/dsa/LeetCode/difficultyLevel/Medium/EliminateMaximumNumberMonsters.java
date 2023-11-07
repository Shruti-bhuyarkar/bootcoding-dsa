package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;
import java.util.Arrays;
public class EliminateMaximumNumberMonsters {


    public static void main(String[] args) {
        int[] dist = {3, 2, 4};
        int[] speed = {5, 3, 2};

        EliminateMaximumNumberMonsters eliminateMaximumNumberMonsters = new EliminateMaximumNumberMonsters();
        int eliminated = eliminateMaximumNumberMonsters.eliminateMaximum(dist, speed);

        System.out.println("Maximum elements eliminated: " + eliminated);
    }

        public int eliminateMaximum(int[] dist, int[] speed) {
            int n = dist.length;
            double[] time_to_city = new double[n];

            for (int i = 0; i < n; i++) {
                time_to_city[i] = (double) dist[i] / speed[i];
            }

            Arrays.sort(time_to_city);

            for (int i = 0; i < n; i++) {
                if (time_to_city[i] <= i) {
                    return i;
                }
            }

            return n;
        }



}
