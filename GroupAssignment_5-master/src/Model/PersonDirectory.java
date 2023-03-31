/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.Person;
import java.util.ArrayList;

/**
 *
 * @author JINESH
 */
public class PersonDirectory {
      ArrayList<Person> allUsers;

    public PersonDirectory() {
        this.allUsers = new ArrayList<>();
    }
    

    public ArrayList<Person> getAllUsers() {
        return allUsers;
    }

    public void setAllUsers(ArrayList<Person> allUsers) {
        this.allUsers = allUsers;
    }
    
    public void addPerson(Person newUser){
        this.allUsers.add(newUser);
    }
    
    public void removePerson(Person user){
        this.allUsers.remove(user);
    }

    public Iterable<Person> getAllPerson() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
