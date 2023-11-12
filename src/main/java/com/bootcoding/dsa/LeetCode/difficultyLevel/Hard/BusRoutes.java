package com.bootcoding.dsa.LeetCode.difficultyLevel.Hard;
import java.util.*;

    public class BusRoutes {
           public static void main(String[] args) {
            BusRoutes busRoutes = new BusRoutes();
            int[][] routes = {{1, 2, 7}, {3, 6, 7}};
            int source = 1;
            int target = 6;

            int result = busRoutes.numBusesToDestination(routes, source, target);
            System.out.println("Least number of buses: " + result);
        }
        public int numBusesToDestination(int[][] routes, int source, int target) {
            if (source == target) return 0;

            Map<Integer, List<Integer>> stopToRoutes = new HashMap<>();
            for (int i = 0; i < routes.length; i++)
                for (int stop : routes[i])
                    stopToRoutes.computeIfAbsent(stop, k -> new ArrayList<>()).add(i);

            Queue<Integer> queue = new LinkedList<>();
            Set<Integer> visitedStops = new HashSet<>();
            Set<Integer> visitedRoutes = new HashSet<>();

            queue.offer(source);
            visitedStops.add(source);
            int numBuses = 0;

            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    int currentStop = queue.poll();

                    for (int route : stopToRoutes.getOrDefault(currentStop, Collections.emptyList())) {
                        if (visitedRoutes.add(route)) {
                            for (int nextStop : routes[route]) {
                                if (visitedStops.add(nextStop)) {
                                    if (nextStop == target) return numBuses + 1;
                                    queue.offer(nextStop);
                                }
                            }
                        }
                    }
                }

                numBuses++;
            }

            return -1;
        }


    }


