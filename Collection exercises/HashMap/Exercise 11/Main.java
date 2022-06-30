package com.company;

import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(1, "Item1");
        hashMap.put(2, "Item2");
        hashMap.put(3, "Item3");

        System.out.println(hashMap.keySet());
    }
}