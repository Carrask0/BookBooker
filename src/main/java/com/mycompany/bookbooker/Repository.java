/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookbooker;

import java.util.ArrayList;

public class Repository {

    // List of Books
    private ArrayList<Book> availableBooks;
    private ArrayList<Book> loanedBooks;
    private ArrayList<Person> persons;

    public Repository() {
        availableBooks = new ArrayList<>();
        loanedBooks = new ArrayList<Book>();
        persons = new ArrayList<Person>();

        // Add some users
        persons.add(new Person("u", "u", false));
        persons.add(new Person("user1", "password1", false));
        persons.add(new Person("user2", "password2", false));
        persons.add(new Person("user3", "password3", false));

    }

    public Person findPerson(String username, String password) {
        for (Person person : persons) {
            if (person.getUsername().equals(username) && person.getPassword().equals(password)) {
                return person;
            }
        }
        return null;
    }

}
