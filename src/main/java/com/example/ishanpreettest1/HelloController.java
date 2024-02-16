package com.example.ishanpreettest1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Label statusLabel;

    private int failedAttempts = 0;
    private final int max_Attempts = 5;

    @FXML
    private void initialize() {

    }

    @FXML
    private void handleLoginButtonAction() {
        String username = usernameField.getText();
        String password = passwordField.getText();


        if (username.isEmpty() || password.isEmpty()) {
            setStatusMessage("Please provide both username and password.");
        } else {

            if ("Ishanpreetsingh".equals(username) && "2221".equals(password)) {
                setStatusMessage("Success!!!");

            } else {
                failedAttempts++;
                setStatusMessage("Sorry, Invalid Username or Password. Attempts left: " + (max_Attempts - failedAttempts));


                if (failedAttempts >= max_Attempts) {
                    setStatusMessage("Sorry, Your Account is Locked!!!");

                }
            }
        }
    }

    private void setStatusMessage(String message) {
        statusLabel.setText(message);
    }
}
