package org.kniit.lab2.task5;

public class Main {
    public static void main(String[] args){
                // Создаем файлы
        File file1 = new File("file1.txt", 100);
        File file2 = new File("file2.txt", 200);
        File file3 = new File("file3.txt", 300);
        File file4 = new File("file4.java", 1000);
        File file5 = new File("file5.py", 2000);
        File file6 = new File("file6.cpp", 1024);
        
        // Создаем папки
        Folder folder1 = new Folder("Folder1");
        Folder folder2 = new Folder("Folder2");
        Folder folder3 = new Folder("Folder3");

        // Добавляем файлы в папки
        folder1.add(file1);
        folder1.add(file2);

        folder2.add(file3);
        folder2.add(folder1); // Вложенная папка
        
        folder3.add(file4);
        folder3.add(file5);
        folder3.add(file6);
        folder1.add(folder3);

        // Выводим структуру файловой системы
        folder2.display(" ", 0);
        
        // Выводим общий размер папки 2
        System.out.println("Total size of Folder2: " + folder2.getSize() + " bytes");
    }
}
