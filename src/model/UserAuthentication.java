/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class UserAuthentication {
      public enum UserType {
        STUDENT,
        TEACHER,
        ADMIN,
        NONE
    }

    public UserType validateUser(String username, String password) throws SQLException, ClassNotFoundException {
        if (validateInTable(username, password, "student", "student_name", "student_password")) {
            return UserType.STUDENT;
        } else if (validateInTable(username, password, "teacher", "teacher_name", "teacher_password")) {
            return UserType.TEACHER;
        } else if (validateInTable(username, password, "admin", "admin_name", "admin_password")) {
            return UserType.ADMIN;
        } else {
            return UserType.NONE;
        }
    }

    private boolean validateInTable(String username, String password, String tableName, String usernameField, String passwordField) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM " + tableName + " WHERE " + usernameField + " = ? AND " + passwordField + " = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, username);
            stmt.setString(2, password);

            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next();
            }
 }
}

}
