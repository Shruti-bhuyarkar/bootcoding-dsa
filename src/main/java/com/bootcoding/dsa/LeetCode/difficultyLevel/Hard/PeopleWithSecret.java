package com.bootcoding.dsa.LeetCode.difficultyLevel.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PeopleWithSecret {
    public static void main(String[] args) {
        PeopleWithSecret solution = new PeopleWithSecret();

        int n = 5;
        int[][] meetings = {
                {0, 1, 10},
                {2, 3, 5},
                {1, 4, 15}

        };
        int firstPerson = 0;

        List<Integer> result = solution.findAllPeople(n, meetings, firstPerson);

        System.out.println("People who haven't attended any meetings: " + result);
    }

    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
        int[] groups = new int[n];
        List<Integer> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        Arrays.fill(groups, -1);
        groups[firstPerson] = firstPerson;

        Arrays.sort(meetings, (a, b) -> Integer.compare(a[2], b[2]));

        for (int i = 0; i < meetings.length; i++) {
            int currentTime = meetings[i][2];
            temp.clear();

            while (i < meetings.length && meetings[i][2] == currentTime) {
                int g1 = find(groups, meetings[i][0]);
                int g2 = find(groups, meetings[i][1]);
                groups[g2] = g1;
                temp.add(meetings[i][0]);
                temp.add(meetings[i][1]);
                i++;
            }

            for (int person : temp) {
                if (find(groups, person) != firstPerson) {
                    groups[person] = person;
                }
            }
        }

        for (int j = 0; j < n; j++) {
            if (find(groups, j) == firstPerson) {
                result.add(j);
            }
        }

        return result;
    }

    private int find(int[] groups, int index) {
        while (groups[index] != -1) {
            index = groups[index];
        }
        return index;
    }
}

