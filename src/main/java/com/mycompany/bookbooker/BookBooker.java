/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.bookbooker;

public class BookBooker {

    public static final int SCREEN_WIDTH = 350;
    public static final int SCREEN_HEIGHT = 700;
    public static Repository repository;

    public BookBooker() {
        this.repository = new Repository();
    }

    public static void main(String[] args) {

        new BookBooker();
        new Controller_Login();
    }
}
