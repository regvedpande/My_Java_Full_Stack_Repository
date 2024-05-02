package com.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

public class RegisterUtility {
    private DataSource dataSource;

    public RegisterUtility(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void addRegistration(Register registration) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO users (name, email, password, gender, city, mobile) VALUES (?, ?, ?, ?, ?, ?)")) {

            preparedStatement.setString(1, registration.getName());
            preparedStatement.setString(2, registration.getEmail());
            preparedStatement.setString(3, registration.getPassword());
            preparedStatement.setString(4, registration.getGender());
            preparedStatement.setString(5, registration.getCity());
            preparedStatement.setLong(6, registration.getMobile());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception as required
        }
    }
}
