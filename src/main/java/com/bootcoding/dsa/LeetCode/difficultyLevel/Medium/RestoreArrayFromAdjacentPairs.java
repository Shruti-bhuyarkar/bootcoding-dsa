package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;
import java.util.*;
public class RestoreArrayFromAdjacentPairs {

    public static void main(String[] args) {
        RestoreArrayFromAdjacentPairs restoreArrayFromAdjacentPairs = new RestoreArrayFromAdjacentPairs();

        int[][] adjacentPairs = {{2, 1}, {3, 4}, {3, 2}};
        int[] restoredArray = restoreArrayFromAdjacentPairs.restoreArray(adjacentPairs);

        System.out.println("Restored Array: " + Arrays.toString(restoredArray));
    }
        public int[] restoreArray(int[][] adjacentPairs) {
            Map<Integer, List<Integer>> map = new HashMap<>();

            for (int[] pair : adjacentPairs) {
                map.computeIfAbsent(pair[0], key -> new ArrayList<>()).add(pair[1]);
                map.computeIfAbsent(pair[1], key -> new ArrayList<>()).add(pair[0]);
            }

            int n = map.size();
            int[] result = new int[n];
            Set<Integer> visited = new HashSet<>();

            // Find the starting point
            for (var entry : map.entrySet()) {
                if (entry.getValue().size() == 1) {
                    result[0] = entry.getKey();
                    visited.add(result[0]);
                    break;
                }
            }

            // Reconstruct the array
            for (int i = 1; i < n; i++) {
                for (int neighbor : map.get(result[i - 1])) {
                    if (!visited.contains(neighbor)) {
                        result[i] = neighbor;
                        visited.add(neighbor);
                        break;
                    }
                }
            }

            return result;
        }


    }


