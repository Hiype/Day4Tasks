package com.company;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String>  color = new ArrayList<String>();

        color.add("Red");
        color.add("Green");
        System.out.printf("Old set: %s%n", color);

        color.set(1, "White");
        System.out.printf("New set: %s%n", color);
    }
}