package com.company;

import java.io.*;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        String line = "";
        StringBuilder sb = new StringBuilder();

        try {
            String location = "C:\\temp\\text.txt";
            FileWriter fw = new FileWriter(location, false);
            fw.write("Some random text, https://www.youtube.com/watch?v=dQw4w9WgXcQ");
            fw.close();
            BufferedReader br = new BufferedReader(new FileReader(location));
            while (line != null) {
                sb.append(line);
                line = br.readLine();
            }
            br.close();
            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}