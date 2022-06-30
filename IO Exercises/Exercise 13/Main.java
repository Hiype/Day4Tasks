package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) {
        BufferedReader br;
        String line;
        String the_variable = "";
        StringBuilder sb = new StringBuilder();

        try {
            br = new BufferedReader(new FileReader("C:\\temp\\text.txt"));
            while ((line = br.readLine()) != null) {
                sb.append(line);
                the_variable += line;
            }
            br.close();
            System.out.println(the_variable);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}