package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) {
        BufferedReader br;
        String line;

        try {
            br = new BufferedReader(new FileReader("C:\\temp\\text.txt"));
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}