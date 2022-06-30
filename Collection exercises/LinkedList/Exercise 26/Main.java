package com.company;

import java.util.LinkedList;

class Main {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<String>();
        list.add("Item");
        list.add("Item2");
        System.out.println(list);
        list.set(0, "Item1");
        System.out.println(list);
    }
}