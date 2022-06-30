package com.company;

import java.util.TreeMap;

class Main {
    public static void main(String[] args) {
        TreeMap < Integer, String > treeMap = new TreeMap< Integer, String >();

        treeMap.put(1, "Item1");
        treeMap.put(2, "Item2");
        treeMap.put(3, "Item3");

        System.out.println(treeMap.ceilingKey(2));
    }
}