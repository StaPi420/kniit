package org.kniit.lab11.task25.demo.src.main.java.com.example;

import java.io.IOException;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.FileVisitResult;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileVisitor extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (Files.isRegularFile(file)){
            FileDAO fileDAO = new FileDAO();
            try {
                fileDAO.saveFile(file.toFile());
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
            return FileVisitResult.CONTINUE;
    }
}