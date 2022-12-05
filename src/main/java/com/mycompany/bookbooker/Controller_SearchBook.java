/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookbooker;

public class Controller_SearchBook {

    Person user;

    public Controller_SearchBook(Person user) {
        this.user = user;
        System.out.println("Controller_SearchBook");
        new GUI_SearchBook(this, user);
    }

}
