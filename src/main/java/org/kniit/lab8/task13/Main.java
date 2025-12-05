package org.kniit.lab8.task13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    private static final String FILE_NAME = "src\\main\\java\\org\\kniit\\lab8\\task13\\users.ser";
    private static final String MENU_STRING = """
Меню:
1. Добавить нового пользователя
2. Показать всех пользователей
3. Сохранить список пользователей в файл
4. Загрузить список пользователей из файла
5. Выйти""";

    public static void saveUsers(List<User> users) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(users);
        }
    }

    public static List<User> loadUsers() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<User>) ois.readObject();
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        }
    }    

public static void main(String[] args){
        System.out.println(MENU_STRING);
        List<User> users = new ArrayList<>(); 
        Scanner scanner = new Scanner(System.in, "ibm866");
        while (true){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Введите юзернейм");
                    String username = scanner.nextLine();
                    System.out.println("Введите адрес электронной почты");
                    String email = scanner.nextLine();
                    System.out.println("Введите возраст");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    users.add(new User(username, age, email));
                    break;
                case 2:
                    for (User user : users){
                        System.out.println(user);
                    }
                    break;
                case 3:
                    try{
                        saveUsers(users);
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                    break;
                case 4:
                    try{
                        users = loadUsers();
                    } catch (IOException | ClassNotFoundException e){
                        System.out.println(e);
                    }
                    break;   
                case 5:
                    scanner.close();
                    return;
                default:
                    System.out.println("Такой команды нет");
                break;
                
            }
            System.out.println("Введите комманду");
        }
    }    
}
