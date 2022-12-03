/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
*/

package com.mycompany.bookbooker;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.*;

public class BookBooker implements ActionListener{

    private static JFrame frame;
    private static JPanel panel;
    
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton loginButton;
    private static JLabel success;

    public BookBooker(){

    }

    public static void main(String[] args) {
        
        frame = new JFrame("BookBooker");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        panel = new JPanel();
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
        loginButton.addActionListener(new BookBooker());
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);

        // successLabel
        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password  = passwordText.getText();

        if (user.equals("admin") && password.equals("admin")) {
            success.setText("Login successful!");
            new GUI_UserHome();
            frame.dispose();
        }
        else{
            success.setText("Login failed!");
        }
    }

    


}
