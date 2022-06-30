package com.company;

import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<String>();
        set1.add("Item1");
        set1.add("Item2");
        System.out.println(set1);

        HashSet<String> set2 = new HashSet<String>();
        set2.add("Item2");
        set2.add("Item3");

        set1.retainAll(set2);
        System.out.println(set1);
    }
}