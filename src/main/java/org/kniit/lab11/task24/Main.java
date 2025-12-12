package org.kniit.lab11.task24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        UserService userService = new UserService();

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== User Management System ===");
        System.out.println("Available commands:");
        System.out.println("  add [name] [email]     - Add new user");
        System.out.println("  list                   - List all users");
        System.out.println("  delete [id]            - Delete user by ID");
        System.out.println("  update [id] [name] [email] - Update user");
        System.out.println("  exit                   - Exit program");
        System.out.println("==============================");


        while (true) {
            String cmd = scanner.nextLine();
            if (cmd.startsWith("add")){
                String[] arguments = cmd.split(" ");
                try {
                    userService.registerUser(arguments[1], arguments[2]);
                }
                catch (Exception e){
                    System.out.println(e);
                }
            }
            else if (cmd.startsWith("list")){
                try{
                    System.out.println("List of users:");
                    for (User user : userService.listAllUsers()) {
                        System.out.println(
                            user.getId() + 
                            user.getName() + 
                            user.getEmail()
                        );
                    }
                }
                catch (Exception e){
                    System.out.println(e);
                }
            }
            else if (cmd.startsWith("delete")){
                try {
                    int userID = Integer.parseInt(cmd.split(" ")[1]);
                    userService.deleteUser(userID);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            else if (cmd.startsWith("update")){
                try {
                    String[] arguments = cmd.split(" ");
                    userService.updateUser(
                        Integer.parseInt(arguments[1]), 
                        arguments[2], 
                        arguments[3]
                    );
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            else if (cmd.startsWith("exit")){
                scanner.close();
                return;
            }
        }
    }
}
