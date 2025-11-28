package org.kniit.lab7.task12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException{
        Path file = Paths.get("src\\main\\java\\org\\kniit\\lab7\\task12\\catalog1");
        
        MyFileVisitor fileVisitor = new MyFileVisitor();
        Files.walkFileTree(file, fileVisitor);
        System.out.println(fileVisitor.getWordAmount());
    }

}
