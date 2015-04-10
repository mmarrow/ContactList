/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactlist;

import java.util.*;
import java.io.*;

//Design Requirement: Demonstrate use of inheritance. Two subclasses = PersonalContact class and BusinessContact class via extends keyword.
public class PersonalContact extends Contact {
    
    //Todo: Need to get and set personal only attributes
    
    //Design Requirement: Encapsulation - Private string for dateOfBirth;
    private String dateOfBirth;
    public String getDateOfBirth() { 
        return dateOfBirth; 
    }
    public void setDateOfBirth(String newValue) { 
        dateOfBirth = newValue;
    }
    
    PersonalContact(BufferedReader keyboard) throws IOException{
        
        super(keyboard);
        
        //Input Requirement: prompt allowing user to enter personal contact specific information (attributes)
        String input;
        
        System.out.println("Date of Birth: ");
        input = keyboard.readLine();
        setDateOfBirth(input);
    }
    
    //Design Requirements: Demonstrate use of polymorphism using super keyword to override toString from Contact Class
    public String toString(){
        //Personal only attributes sent to string and added to super.
        return "Type: Personal Contact\n" + super.toString() + "\nDate of Birth: " + this.getDateOfBirth() + "\n";    
    }
}
    
