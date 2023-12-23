package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

import java.util.HashSet;

public class PathCrossing {

    public static void main(String[] args) {
        PathCrossing solution = new PathCrossing();
        String path = "NES";

        boolean result = solution.isPathCrossing(path);
        System.out.println("Does the path cross itself? " + result);
    }
    public boolean isPathCrossing(String path) {
        int x = 0, y = 0;
        HashSet<String> visited = new HashSet<>();
        visited.add("0,0");

        for (char direction : path.toCharArray()) {
            switch (direction) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }

            String currentPoint = x + "," + y;
            if (visited.contains(currentPoint)) {
                return true; // Path crosses itself
            }

            visited.add(currentPoint);
        }

        return false; // Path does not cross itself
    }

}

