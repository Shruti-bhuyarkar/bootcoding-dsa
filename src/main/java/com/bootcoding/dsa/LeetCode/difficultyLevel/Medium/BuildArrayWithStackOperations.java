package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;
import java.util.List;
import java.util.HashSet;
import java.util.ArrayList;
public class BuildArrayWithStackOperations {
    public static void main(String[] args) {
        BuildArrayWithStackOperations buildArrayWithStackOperations = new BuildArrayWithStackOperations();

        // Test the buildArray method
        int[] target = {1, 3};
        int n = 3;

        List<String> operationSequence = buildArrayWithStackOperations.buildArray(target, n);
        System.out.println("Stack Operation Sequence to Build the Target Array:");
        for (String operation : operationSequence) {
            System.out.println(operation);
        }
    }
        public List<String> buildArray(int[] target, int n) {
            HashSet<Integer> targetSet = new HashSet<>();
            for (int num : target) {
                targetSet.add(num);
            }

            List<String> result = new ArrayList<>();
            for (int i = 1; i <= target[target.length - 1]; i++) {
                if (targetSet.contains(i)) {
                    result.add("Push");
                } else {
                    result.add("Push");
                    result.add("Pop");
                }
            }
            return result;
        }


    }


