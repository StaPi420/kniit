package com.example;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {
    @Override
    public void create(User user) throws SQLException {
        try (Connection connection = DatabaseConnection.getConnection()){
            String query = """
                    INSERT INTO users (name, email) VALUES (?, ?)
                    """; 
            PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, user.getName());
            statement.setString(2, user.getEmail());
            statement.executeUpdate();

            try (ResultSet resultSet = statement.getGeneratedKeys()){
                if (resultSet.next()){
                    user.setId(resultSet.getInt(1));
                }
            }
        }
    }
    public User findById(int id) throws SQLException {
        try (Connection connection = DatabaseConnection.getConnection()){
            String query = String.format("""
                    SELECT id, name, email
                    FROM users
                    WHERE id = %d
                    """, id);
            User user = new User();
            PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            try (ResultSet resultSet = statement.executeQuery()){
                user = extractUserFromResultSet(resultSet);
            }
            return user;
        }
    }
    @Override
    public List<User> findAll() throws SQLException{
        try (Connection connection = DatabaseConnection.getConnection()){
            String query = """
                    SELECT id, name, email
                    FROM users
                    """;
            List<User> res = new ArrayList<>();
            PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            try (ResultSet resultSet = statement.executeQuery()){
                while (resultSet.next()){
                    res.add(extractUserFromResultSet(resultSet));
                }
            }
            return res;
        }
    }
    @Override
    public void update(User user) throws SQLException {
        String sql = "UPDATE users SET name = ?, email = ? WHERE id = ?";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getEmail());
            stmt.setInt(3, user.getId());
            stmt.executeUpdate();
        }
    }

    @Override
    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM users WHERE id = ?";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    @Override
    public boolean emailExists(String email) throws SQLException {
        String sql = "SELECT COUNT(*) FROM users WHERE email = ?";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, email);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        }
        return false;
    }

    private User extractUserFromResultSet(ResultSet rs) throws SQLException {
        return new User(
            rs.getInt("id"),
            rs.getString("name"),
            rs.getString("email")
        );
    }
}
