package com.company;

import java.util.LinkedList;

class Main {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<String>();
        list.add("Item");
        isEmpty(list);
        list.remove();
        isEmpty(list);
    }

    public static void isEmpty(LinkedList<String> list) {
        if(list.size() == 0) {
            System.out.println("Empty");
        } else {
            System.out.println("Not empty");
        }
    }
}