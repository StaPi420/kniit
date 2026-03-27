package com.example.lab2.task1;

import java.io.*;

public class FileInterface {
    private static FileInterface instance;

    private FileInterface() {
        File file = new File("file.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static FileInterface getInstance() {
        if (instance == null) {
            instance = new FileInterface();
        }
        return instance;
    }

    public void writeToFile(String content) {
        try (java.io.FileWriter writer = new java.io.FileWriter("file.txt", true)) {
            writer.write(content + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String readFromFile() {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader("file.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    
}
