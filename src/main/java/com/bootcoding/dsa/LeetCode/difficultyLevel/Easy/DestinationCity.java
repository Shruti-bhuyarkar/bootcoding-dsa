package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;
//Destination City
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class DestinationCity {

    public static void main(String[] args) {
        DestinationCity solution = new DestinationCity();

        List<List<String>> paths = List.of(
                List.of("London", "New York"),
                List.of("New York", "Lima"),
                List.of("Lima", "Sao Paulo")
        );

        String result = solution.destCity(paths);

        System.out.println("Destination City: " + result);
    }
        public String destCity(List<List<String>> paths) {
            Set<String> destinations = new HashSet<>();
            Set<String> sources = new HashSet<>();

            // Add all cities to the sources set
            for (List<String> path : paths) {
                sources.add(path.get(0));
                destinations.add(path.get(1));
            }

            // Remove cities with outgoing paths from the destinations set
            destinations.removeAll(sources);

            // The remaining city in the destinations set is the destination city
            return destinations.iterator().next();
        }


    }


