package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

import java.util.PriorityQueue;

public class FurthestBuildingSolution {
    public static void main(String[] args) {
        FurthestBuildingSolution solution = new FurthestBuildingSolution();

        int[] heights = {4, 2, 7, 6, 9, 14, 12};
        int bricks = 5;
        int ladders = 1;

        int result = solution.furthestBuilding(heights, bricks, ladders);

        System.out.println("Furthest Building Index: " + result);
    }
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < heights.length - 1; i++) {
            int diff = heights[i + 1] - heights[i];

            if (diff > 0) {
                priorityQueue.offer(diff);

                if (priorityQueue.size() > ladders) {
                    bricks -= priorityQueue.poll();
                }

                if (bricks < 0) {
                    return i; // Return the furthest index if bricks run out
                }
            }
        }

        return heights.length - 1; // If all buildings are reachable
    }


}
