package com.bootcoding.dsa.hashtable;

import java.util.HashMap;

public class HashTableExample {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 20, 10};
        //find duplicate element in an array
int m = a[0];
        HashMap<Integer , Integer> store = new HashMap<>();
        for (int i = 0; i < a.length; i++){
           // Object store;
            if(store.containsKey(a[i])){
               int val =  store.get(a[i]);
               store.put(a[i], val + 1);
            }else {
                store.put(a[i] , 1);
            }
        }

        for (Integer key : store.keySet()){
            int k = key;
            int val = store.get(k);
            if(val > a.length/2){
                m = k;
                System.out.println(a);
            }
        }
    }
}
