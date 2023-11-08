package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

public class DetermineCellIsReachableGivenTime {
    public static void main(String[] args) {
        DetermineCellIsReachableGivenTime determineCellIsReachableGivenTime = new DetermineCellIsReachableGivenTime();

        // Example usage:
        int sx = 1;
        int sy = 1;
        int fx = 4;
        int fy = 3;
        int t = 4;

        boolean reachable = determineCellIsReachableGivenTime.isReachableAtTime(sx, sy, fx, fy, t);

        if (reachable) {
            System.out.println("The point is reachable within the given time.");
        } else {
            System.out.println("The point is not reachable within the given time.");
        }
    }
        public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
            int diffx = Math.abs(sx - fx);
            int diffy = Math.abs(sy - fy);
            int minTime = Math.max(diffx, diffy);

            if (minTime == 0 && t == 1) {
                return false;
            }

            if (minTime <= t) {
                return true;
            }

            return false;
        }


    }


