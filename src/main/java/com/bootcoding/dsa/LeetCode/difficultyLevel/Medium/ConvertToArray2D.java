package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertToArray2D {

    public static void main(String[] args) {
        ConvertToArray2D solution = new ConvertToArray2D();

        // Example usage
        int[] nums = {4, 4, 7, 2, 2, 2, 3, 5, 6};
        List<List<Integer>> result = solution.findSolution(nums);

        System.out.println("Resulting 2D array:");
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
    public List<List<Integer>> findSolution(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();

        // Count the occurrences of each element
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        List<List<Integer>> result = new ArrayList<>();

        for (int num : nums) {
            boolean added = false;

            for (List<Integer> row : result) {
                if (countMap.get(num) > 0 && !row.contains(num)) {
                    row.add(num);
                    countMap.put(num, countMap.get(num) - 1);
                    added = true;
                    break;
                }
            }

            if (!added) {
                List<Integer> newRow = new ArrayList<>();
                newRow.add(num);
                countMap.put(num, countMap.get(num) - 1);
                result.add(newRow);
            }
        }

        return result;
    }

}
