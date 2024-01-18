package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class UniqueOccurrences {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 1, 1, 3};
        int[] arr2 = {1, 2};
        int[] arr3 = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};

        System.out.println(areOccurrencesUnique(arr1)); // Output: true
        System.out.println(areOccurrencesUnique(arr2)); // Output: false
        System.out.println(areOccurrencesUnique(arr3)); // Output: true
    }
    public static boolean areOccurrencesUnique(int[] arr) {
        // Use a HashMap to count occurrences of each value
        Map<Integer, Integer> occurrencesMap = new HashMap<>();

        for (int num : arr) {
            occurrencesMap.put(num, occurrencesMap.getOrDefault(num, 0) + 1);
        }

        // Use a HashSet to check if the occurrences are unique
        Set<Integer> uniqueOccurrences = new HashSet<>(occurrencesMap.values());

        // If the size of the set is equal to the size of the map, occurrences are unique
        return uniqueOccurrences.size() == occurrencesMap.size();
    }


}
