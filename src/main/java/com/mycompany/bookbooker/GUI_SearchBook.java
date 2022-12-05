/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookbooker;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI_SearchBook {

    private static JFrame frame = null;
    private static JPanel panel;

    private static JButton searchByTitleButton;
    private static JButton searchByAuthorButton;
    private static JButton searchByISBNButton;
    private static JButton searchByGenreButton;
    private static JButton searchByYearButton;

    private static JTextField searchByTitleField;
    private static JTextField searchByAuthorField;
    private static JTextField searchByISBNField;
    private static JTextField searchByGenreField;
    private static JTextField searchByYearField;

    Controller_SearchBook controller;
    Person user;

    public GUI_SearchBook(Controller_SearchBook controller, Person user) {

        this.controller = controller;
        this.user = user;

        //GUI INITIAL CONFIG
        this.frame = new JFrame();
        panel = new JPanel();
        frame.setSize(BookBooker.SCREEN_WIDTH, BookBooker.SCREEN_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        // Title label (SEARCH BOOK)
        JLabel label = new JLabel("SEARCH BOOK");
        label.setBounds(10, 20, 200, 25);
        panel.add(label);

        // Search by title label
        JLabel searchByTitleLabel = new JLabel("Search by title:");
        searchByTitleLabel.setBounds(10, 80, 200, 25);
        panel.add(searchByTitleLabel);

        // Search by title text field
        searchByTitleField = new JTextField(20);
        searchByTitleField.setBounds(10, 110, 200, 25);
        panel.add(searchByTitleField);

        // Search by title button
        searchByTitleButton = new JButton("SEARCH");
        searchByTitleButton.setBounds(10, 140, 200, 25);
        panel.add(searchByTitleButton);

        // Search by author label
        JLabel searchByAuthorLabel = new JLabel("Search by author:");
        searchByAuthorLabel.setBounds(10, 180, 200, 25);
        panel.add(searchByAuthorLabel);

        // Search by author text field
        searchByAuthorField = new JTextField(20);
        searchByAuthorField.setBounds(10, 210, 200, 25);
        panel.add(searchByAuthorField);

        // Search by author button
        searchByAuthorButton = new JButton("SEARCH");
        searchByAuthorButton.setBounds(10, 240, 200, 25);
        panel.add(searchByAuthorButton);

        // Search by ISBN label
        JLabel searchByISBNLabel = new JLabel("Search by ISBN:");
        searchByISBNLabel.setBounds(10, 280, 200, 25);
        panel.add(searchByISBNLabel);

        // Search by ISBN text field
        searchByISBNField = new JTextField(20);
        searchByISBNField.setBounds(10, 310, 200, 25);
        panel.add(searchByISBNField);

        // Search by ISBN button
        searchByISBNButton = new JButton("SEARCH");
        searchByISBNButton.setBounds(10, 340, 200, 25);
        panel.add(searchByISBNButton);

        // Search by genre label
        JLabel searchByGenreLabel = new JLabel("Search by genre:");
        searchByGenreLabel.setBounds(10, 380, 200, 25);
        panel.add(searchByGenreLabel);

        // Search by genre text field
        searchByGenreField = new JTextField(20);
        searchByGenreField.setBounds(10, 410, 200, 25);
        panel.add(searchByGenreField);

        // Search by genre button
        searchByGenreButton = new JButton("SEARCH");
        searchByGenreButton.setBounds(10, 440, 200, 25);
        panel.add(searchByGenreButton);

        // Search by year label
        JLabel searchByYearLabel = new JLabel("Search by year:");
        searchByYearLabel.setBounds(10, 480, 200, 25);
        panel.add(searchByYearLabel);

        // Search by year text field
        searchByYearField = new JTextField(20);
        searchByYearField.setBounds(10, 510, 200, 25);
        panel.add(searchByYearField);

        // Search by year button
        searchByYearButton = new JButton("SEARCH");
        searchByYearButton.setBounds(10, 540, 200, 25);
        panel.add(searchByYearButton);

        // Back button
        JButton backButton = new JButton("BACK");
        backButton.setBounds(10, 580, 200, 25);
        panel.add(backButton);

        frame.setVisible(true);
    }

}
