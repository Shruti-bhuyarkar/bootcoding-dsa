package com.bootcoding.dsa.LeetCode.difficultyLevel.Hard;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class DesignGraphWithShortestPathCalculator {
           public static void main(String[] args) {

            int n = 5;
            int[][] edges = {{0, 1, 2}, {0, 2, 4}, {1, 2, 1}, {1, 3, 7}, {2, 4, 3}, {3, 4, 1}};

            DesignGraphWithShortestPathCalculator graph = new DesignGraphWithShortestPathCalculator(n, edges);

            // Add an additional edge
            int[] additionalEdge = {3, 2, 5};
            graph.addEdge(additionalEdge);

            // Find the shortest path between two nodes
            int shortestPath = graph.shortestPath(0, 4);

            System.out.println("Shortest Path between nodes 0 and 4: " + shortestPath);
        }
    

    List<List<int[]>> res;
        int n;
        public DesignGraphWithShortestPathCalculator(int n, int[][] edges) {
            this.n = n;
            res = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                res.add(new ArrayList<>());
            }
            for (int[] edge : edges) {
                int u = edge[0], v = edge[1], w = edge[2];
                res.get(u).add(new int[]{v, w});
            }
        }

        public void addEdge(int[] edge) {
            int u = edge[0], v = edge[1], w = edge[2];
            res.get(u).add(new int[]{v, w});
        }

        public int shortestPath(int node1, int node2) {
            PriorityQueue<int[]> nm = new PriorityQueue<>((a, b) -> a[1] - b[1]);
            nm.offer(new int[]{node1, 0});
            boolean[] visited = new boolean[n];
            while (!nm.isEmpty())
            {
                int[] curr = nm.poll();
                int u = curr[0], d = curr[1];
                if (visited[u])
                {
                    continue;
                }
                visited[u] = true;
                if (u == node2) return d;
                for (int[] e : res.get(u))
                {
                    int v = e[0], w = e[1];
                    if (!visited[v])
                    {
                        nm.offer(new int[]{v, d + w});
                    }
                }
            }
            return -1;
        }
    }
