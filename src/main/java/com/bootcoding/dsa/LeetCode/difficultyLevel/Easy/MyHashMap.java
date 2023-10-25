package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

import java.util.Arrays;

class MyHashMap {

    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(1, 2);
        hashMap.put(2, 3);
        System.out.println("Value for key 1: " + hashMap.get(1)); // Should print 2
        System.out.println("Value for key 3: " + hashMap.get(3)); // Should print -1
        hashMap.remove(2);
        System.out.println("Value for key 2 after removal: " + hashMap.get(2)); // Should print -1
    }
    private int[] map;
    public MyHashMap() {
        map = new int[1000001];
        Arrays.fill(map, -1);
    }
    public void put(int key, int value) {
        map[key] = value;
    }
    public int get(int key) {
        return map[key];
    }
    public void remove(int key) {
        map[key] = -1;
    }
}
