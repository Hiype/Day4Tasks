package com.company;

import java.io.*;

class Main {
    public static void main(String[] args) {
        String line = "";
        StringBuilder sb = new StringBuilder();

        try {
            String location = "C:\\temp\\text.txt";
            BufferedReader br = new BufferedReader(new FileReader(location));
            int counter = 0;
            while (line != null && counter <= 3) {
                sb.append(line + "\n");
                line = br.readLine();
                counter++;
            }
            br.close();
            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}