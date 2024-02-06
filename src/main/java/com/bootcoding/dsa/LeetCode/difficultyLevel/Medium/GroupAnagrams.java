package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static void main(String[] args) {
        GroupAnagrams solution = new GroupAnagrams();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = solution.groupAnagrams(strs);

        System.out.println("Anagram Groups: " + result);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String str : strs) {
            // Sort the characters of the word to create a key for the hashmap
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);

            // Check if the key is already in the hashmap
            if (!anagramGroups.containsKey(key)) {
                anagramGroups.put(key, new ArrayList<>());
            }

            // Add the word to the corresponding anagram group
            anagramGroups.get(key).add(str);
        }

        // Convert the values of the hashmap to a list to get the final result
        return new ArrayList<>(anagramGroups.values());
    }


}
