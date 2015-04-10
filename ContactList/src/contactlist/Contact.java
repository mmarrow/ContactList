/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactlist;

import java.util.*;
import java.lang.System;
import java.io.*;

/**
 *
 * @author Mike
 */

//Design Requirement: Demonstrate use of inheritance. One Abstract Class = Contact
abstract public class Contact {
    
    //These are the common Contact attributes for Business and Personal
    //get methods
    
    //Design Requirement: Encapsulation 
    private String firstName;
        public String getFirstName() { 
            return firstName; 
        }
        public void setFirstName(String newValue) {
            firstName = newValue;
        }
    
    //Design Requirement: Encapsulation
    private String lastName;
        public String getLastName() { 
            return lastName; 
        }
        public void setLastName(String newValue) {
            lastName = newValue;
        }
        
    //Design Requirement: Encapsulation    
    private String address;
        public String getAddress() {
            return address;
        }
        public void setAddress(String newValue){  
            address = newValue;
        }
        
    //Design Requirement: Encapsulation
    private String phoneNumber;
        public String getPhoneNumber() {
            return phoneNumber; 
        }
        public void setPhoneNumber(String newValue) {
            phoneNumber = newValue;
        }
        
    //Design Requirement: Encapsulation
    private String email;
        public String getEmail() {
            return email;
        }
        public void setEmail(String newValue) { 
            email = newValue; 
        }
    
    
    Contact (BufferedReader keyboard) throws IOException {
        
        String input;
        
        //Input Requirement: prompt allowing user to enter shared contact information (attributes)
        
        //set methods
        System.out.println("First Name: ");
        input = keyboard.readLine();
        this.setFirstName(input);
        
        System.out.println("Last Name: ");
        input = keyboard.readLine();
        this.setLastName(input);
        
        System.out.println("Address: ");
        input = keyboard.readLine();
        this.setAddress(input);
        
        System.out.println("Phone Number: ");
        input = keyboard.readLine();
        this.setPhoneNumber(input);
        
        System.out.println("Email: ");
        input = keyboard.readLine();
        this.setEmail(input);
    }
    
    
    
    public String toString() {
        //Set common atrributes to a string
        return "Name: " + this.getFirstName() + " " + this.getLastName() + "\nAddress: " + this.getAddress() + "\nPhone Number: " + this.getPhoneNumber()+ "\nEmail: " + this.getEmail();
    }

}

