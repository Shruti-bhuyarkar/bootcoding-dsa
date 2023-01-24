package com.bootcoding.dsa.hashtable;

import java.util.HashMap;

public class HashTableExample {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 20, 10};
        //find duplicate element in an array

        HashMap store = new HashMap();
        for (int i = 0; i < a.length; i++){
           // Object store;
            if(store.containsKey(a[i])){
               int val = (int) store.get(a[i]);
               store.put(a[i], val + 1);
            }else {
                store.put(a[i] , 1);
            }
        }
        for (Object key : store.keySet()){
            int k = (int) key;
            int val = (int) store.get(k);
            if(val > 1){
                System.out.println(k);
            }
        }
    }
}
