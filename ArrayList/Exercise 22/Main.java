package com.company;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String>  colors = new ArrayList<String>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        colors.add("Pink");

        for(int i=0; i< colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}