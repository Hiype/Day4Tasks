package com.company;

import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<String>();
        set1.add("Item1");
        set1.add("Item2");
        System.out.println(set1);

        set1.clear();
        System.out.println(set1);
    }
}