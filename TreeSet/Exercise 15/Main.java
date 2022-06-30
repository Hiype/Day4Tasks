package com.company;

import java.util.TreeSet;

class Main {
    public static void main(String[] args) {
        TreeSet <Integer>tree = new TreeSet<Integer>();

        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);

        System.out.printf("Last element: %d", tree.pollLast());
    }
}