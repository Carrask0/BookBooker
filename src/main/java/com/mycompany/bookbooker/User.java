/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookbooker;

import java.util.ArrayList;

public class User extends Person{

    private ArrayList<Book> loanedBooks;
    private ArrayList<Book> donatedBooks;

    public User(String username, String password) {
        super(username, password);
        loanedBooks = new ArrayList<Book>();
        donatedBooks = new ArrayList<Book>();
    }

    // Getters
    public ArrayList<Book> getLoanedBooks() {
        return loanedBooks;
    }
    public ArrayList<Book> getDonatedBooks() {
        return donatedBooks;
    }

    // Add a book to the list of loaned books
    public void addLoanedBook(Book book) {
        loanedBooks.add(book);
    }
    // Add a book to the list of donated books
    public void addDonatedBook(Book book) {
        donatedBooks.add(book);
    }

}
