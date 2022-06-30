package com.company;

import java.util.ArrayList;
import java.util.PriorityQueue;

class Main {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();

        queue.add("Item1");
        queue.add("Item2");
        queue.add("Item3");

        ArrayList<String> arr = new ArrayList<String>(queue);
        System.out.println(arr);
    }
}