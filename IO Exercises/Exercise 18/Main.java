package com.company;

import java.io.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String location = "C:\\temp\\text.txt";
        String longest_word = "";
        String line = "";
        Scanner sc = new Scanner(new File(location));

        while (sc.hasNext()) {
            line = sc.next();
            if (line.length() > longest_word.length()) {
                longest_word = line;
            }
        }

        System.out.printf("Longest word: %s", longest_word);
    }
}