/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookbooker;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI_Login implements ActionListener {

    private static JFrame frame = null;
    private static JPanel panel;

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton loginButton;
    private static JLabel success;

    Controller_Login controller;

    public GUI_Login(Controller_Login controller, Boolean error) {

        this.controller = controller;

        if (frame == null) {

            //GUI INITIAL CONFIG
            frame = new JFrame("BookBooker");
            panel = new JPanel();
            frame.setSize(BookBooker.SCREEN_WIDTH, BookBooker.SCREEN_HEIGHT);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(panel);
            panel.setLayout(null);

            // userLabel
            userLabel = new JLabel("User");
            userLabel.setBounds(10, 20, 80, 25);
            panel.add(userLabel);

            // userTextField
            userText = new JTextField(20);
            userText.setBounds(100, 20, 165, 25);
            panel.add(userText);

            // passwordLabel
            passwordLabel = new JLabel("Password");
            passwordLabel.setBounds(10, 50, 80, 25);
            panel.add(passwordLabel);

            // passwordTextField
            passwordText = new JPasswordField(20);
            passwordText.setBounds(100, 50, 165, 25);
            panel.add(passwordText);

            // loginButton
            loginButton = new JButton("Login");
            loginButton.addActionListener(new GUI_Login(this.controller, false));
            loginButton.setBounds(10, 80, 80, 25);
            panel.add(loginButton);

            // successLabel
            success = new JLabel("");
            success.setBounds(10, 110, 300, 25);
            if (error) {
                success.setText("Login failed. Please try again.");
            }
            panel.add(success);

            frame.setVisible(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();

        // Empty userText and passwordText
        userText.setText("");
        passwordText.setText("");

        this.controller.login(user, password);
    }
}
