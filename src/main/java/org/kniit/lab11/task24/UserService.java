package org.kniit.lab11.task24;

import java.sql.SQLException;
import java.util.List;

public class UserService {
    private final UserDAO userDAO;

    public UserService() {
        this.userDAO = new UserDAOImpl();
    }

    public void registerUser(String name, String email) throws SQLException {
        if (userDAO.emailExists(email)) {
            System.out.println("Error: Email '" + email + "' already exists!");
        }

        User user = new User(name, email);
        userDAO.create(user);
        System.out.println("User added successfully! ID: " + user.getId());
    }

    public List<User> listAllUsers() throws SQLException {
        return userDAO.findAll();
    }

    public boolean deleteUser(int id) throws SQLException {
 
        User user = userDAO.findById(id);
        if (user == null) {
            System.out.println("Error: User with ID " + id + " not found!");
            return false;
        }

        userDAO.delete(id);
        System.out.println("User deleted successfully!");
        return true;
    }

    public boolean updateUser(int id, String newName, String newEmail) throws SQLException {
        User user = userDAO.findById(id);
        if (user == null) {
            System.out.println("Error: User with ID " + id + " not found!");
            return false;
        }

        if (!user.getEmail().equals(newEmail) && userDAO.emailExists(newEmail)) {
            System.out.println("Error: Email '" + newEmail + "' already exists!");
            return false;
        }

        user.setName(newName);
        user.setEmail(newEmail);
        userDAO.update(user);
        System.out.println("User updated successfully!");
        return true;
    }
}