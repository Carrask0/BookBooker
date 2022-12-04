/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookbooker;

public class Controller_UserHome {

    Person user;

    public Controller_UserHome(Person person){
        this.user = person;
        new GUI_UserHome(user);
    }

    

}
