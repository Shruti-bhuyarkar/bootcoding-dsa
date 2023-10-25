package com.bootcoding.dsa.LeetCode.difficultyLevel.Hard;
import java.util.*;
public class ParallelCoursesIII {
    public static void main(String[] args) {
        ParallelCoursesIII parallelCoursesIII = new ParallelCoursesIII();

        // Example usage:
        int n = 5;
        int[][] relations = {{2, 1}, {3, 1}, {4, 2}, {5, 3}};
        int[] time = {3, 2, 4, 1, 1};

        int result = parallelCoursesIII.minimumTime(n, relations, time);
        System.out.println("Minimum Time: " + result);
    }
        private int[] time;
        private List<List<Integer>> graph;
        private int[] memo;

        public int minimumTime(int n, int[][] relations, int[] time) {
            this.time = time;
            this.graph = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                graph.add(new ArrayList<>());
            }

            for (int[] relation : relations) {
                int prev = relation[0] - 1;
                int next = relation[1] - 1;
                graph.get(next).add(prev);
            }

            memo = new int[n];

            int overallMinTime = 0;

            for (int i = 0; i < n; i++) {
                overallMinTime = Math.max(overallMinTime, calculateTime(i));
            }

            return overallMinTime;
        }

        private int calculateTime(int course) {
            if (memo[course] != 0) {
                return memo[course];
            }

            int maxPrerequisiteTime = 0;
            for (int prereq : graph.get(course)) {
                maxPrerequisiteTime = Math.max(maxPrerequisiteTime, calculateTime(prereq));
            }

            memo[course] = maxPrerequisiteTime + time[course];
            return memo[course];
        }


    }


