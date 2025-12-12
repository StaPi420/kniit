package org.kniit.lab11.task25.demo.src.main.java.com.example;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileProcessor {
    public void proccesFiles(String path){
        Path file = Paths.get(path);
        
        MyFileVisitor fileVisitor = new MyFileVisitor();
        try {
            Files.walkFileTree(file, fileVisitor);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
