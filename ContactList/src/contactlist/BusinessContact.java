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

//Design Requirement: Demonstrate use of inheritance. Two subclasses = PersonalContact class and BusinessContact class via extends keyword.
public class BusinessContact extends Contact {
    
//Business only attributes 
    
    //Design Requirement: Encapsulation - Private string for jobTitle 
    private String jobTitle;
    public String getJobTitle() { 
        return jobTitle;
    }
    public void setJobTitle(String newValue) { 
        jobTitle = newValue;
    }
    
    //Design Requirement: Encapsulation - Private string for organization 
    private String organization;
    public String getOrganization() { 
        return organization; 
    }
    public void setOrganization( String newValue ) {  
        organization = newValue; 
    }
    
    
    BusinessContact(BufferedReader keyboard) throws IOException {
        
        super(keyboard);
        
        String input;
        //Input Requirement: prompt allowing user to enter business contact specific information (attributes)
        System.out.println("Job Title: ");
        input = keyboard.readLine();
        this.setJobTitle(input);
        
        System.out.println("Organization: ");
        input = keyboard.readLine();
        this.setOrganization(input);
        System.out.println("");
    };
    
    
    //Design Requirements: Demonstrate use of polymorphism using super keyword to override toString from Contact Class
    public String toString(){
        //Business only attributes send to string and added to super.
       return "Type: Business Contact\n" + super.toString() + "\nJob Title: " + this.getJobTitle() + "\nOrganization: " + this.getOrganization() + "\n";
    }    
    
}
