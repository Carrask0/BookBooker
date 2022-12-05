/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookbooker;

public class Book {

    private String title;
    private int year;
    private String author;
    private String ISBN;
    private String genre;

    public Book(String title, int year, String author, String ISBN, String genre) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.ISBN = ISBN;
        this.genre = genre;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getGenre() {
        return genre;
    }
}
