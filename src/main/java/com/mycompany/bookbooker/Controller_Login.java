/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookbooker;

public class Controller_Login {

    public Controller_Login(){
        new GUI_Login(this, false);
    }

    public void login(String username, String password){
        Person person = BookBooker.repository.findPerson(username, password);
        if(person != null){
            if(person.getIsAdmin()){
               //TODO new Controller_AdminHome(person);
            } else {
                new Controller_UserHome(person);
            }
        } else {
            new GUI_Login(this, true);
        }
    }

        

}
