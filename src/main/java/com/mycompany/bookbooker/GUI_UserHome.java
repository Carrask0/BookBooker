/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookbooker;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

public class GUI_UserHome implements ActionListener {

    private static JFrame frame = null;
    private static JPanel panel;
    private static JLabel label;
    private static JButton searchBookButton;
    private static JButton donateBookButton;

    Controller_UserHome controller;
    Person user;

    public GUI_UserHome(Controller_UserHome controller, Person user) {
        this.controller = controller;
        this.user = user;

        //GUI INITIAL CONFIG
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(BookBooker.SCREEN_WIDTH, BookBooker.SCREEN_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        // New label
        JLabel label = new JLabel("Welcome " + this.user.getUsername() + "!");
        label.setBounds(10, 20, 200, 25);
        panel.add(label);

        // Add 'SEARCH BOOK' button
        searchBookButton = new JButton("SEARCH BOOK");
        searchBookButton.setBounds(10, 80, 200, 25);
        searchBookButton.addActionListener(this);
        panel.add(searchBookButton);

        // Add 'DONATE BOOK' button
        donateBookButton = new JButton("DONATE BOOK");
        donateBookButton.setBounds(10, 120, 200, 25);
        donateBookButton.addActionListener(this);
        panel.add(donateBookButton);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == searchBookButton) {
            this.controller.changeViewSearch();

        } else if (e.getSource() == donateBookButton) {
            this.controller.changeViewDonate();
        }
    }

}
