package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private void loginAction() {
        String username = usernameField.getText();
        String password = passwordField.getText();


        System.out.println("Username: " + username + ", Password: " + password);

    }
}
