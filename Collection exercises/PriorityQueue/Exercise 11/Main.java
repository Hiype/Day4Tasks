package com.company;

import java.util.PriorityQueue;

class Main {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();

        queue.add("Item1");
        queue.add("Item2");
        queue.add("Item3");

        System.out.println(queue.toString());
    }
}