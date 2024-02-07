package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        SortCharactersByFrequency solution = new SortCharactersByFrequency();
        String s = "tree";
        String result = solution.frequencySort(s);

        System.out.println("Sorted String: " + result);  // Output: "eert" or "eetr"
    }
        public String frequencySort(String s) {
            Map<Character, Integer> hm = new HashMap<>();

            for (char c : s.toCharArray()) {
                hm.put(c, hm.getOrDefault(c, 0) + 1);
            }

            PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
                    (a, b) -> b.getValue() - a.getValue()
            );

            pq.addAll(hm.entrySet());

            StringBuilder result = new StringBuilder();
            while (!pq.isEmpty()) {
                Map.Entry<Character, Integer> entry = pq.poll();
                result.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
            }

            return result.toString();
        }
    }



