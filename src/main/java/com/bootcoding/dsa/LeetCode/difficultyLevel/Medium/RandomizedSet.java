package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class RandomizedSet {
    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();

        System.out.println(randomizedSet.insert(1));
        System.out.println(randomizedSet.remove(2));
        System.out.println(randomizedSet.insert(2));
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.remove(1));
        System.out.println(randomizedSet.insert(2));
        System.out.println(randomizedSet.getRandom());
    }
    private ArrayList<Integer> list;
    private HashMap<Integer, Integer> map;
    private Random random;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }

        map.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }

        int lastIndex = list.size() - 1;
        int lastElement = list.get(lastIndex);
        int indexToRemove = map.get(val);

        list.set(indexToRemove, lastElement);
        map.put(lastElement, indexToRemove);

        list.remove(lastIndex);
        map.remove(val);

        return true;
    }

    public int getRandom() {
        int randomIndex = random.nextInt(list.size());
        return list.get(randomIndex);
    }


}

