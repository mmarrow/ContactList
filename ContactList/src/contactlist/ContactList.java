/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactlist;

import java.util.*;
import java.lang.*;
import java.lang.System;
import java.io.*;


/**
 *
 * @author Mike
 */
public class ContactList {

    /**
     * @param args the command line arguments
     */
    
   
    //Design Requirement: Use a type of collection to hold contanct list. (Using Arraylist)
    public static ArrayList<Contact> contactList = new ArrayList();
    
    public static void main(String[] args) throws IOException {
   
        
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(in);
        
        //Input Requirement - Prompt allowing user to enter four options business, Personal, Display contacts and quit. Repeat process until the user selects “quit.”
        String input;
        
        do {
            //Options until user types 'q'.
            System.out.println("Welcome to your Contact List\n");
            System.out.println("Please enter the number below that references the action you would like to take.");
            System.out.println("1. Please add a Business Contact");
            System.out.println("2. Please add a Personal Contact");
            System.out.println("3. Display Contacts\n");
            System.out.println("To quit and exit your Contact List just type 'q': ");
            input = keyboard.readLine();
            
            //Quit the application immediately.
            if(input.equals("q") || input.equals("quit") || input.equals("exit")){ 
                break; 
            }
            
            //else if statements to distinguish a business contact from a personal contact 
            else if(input.equals("1")){
                System.out.println("\nENTER BUSINESS CONTACT: ");
                BusinessContact b = new BusinessContact(keyboard);
                contactList.add(b);
            }
            
            else if(input.equals("2")){
                System.out.println("ENTER PERSONAL CONTACT: ");
                PersonalContact p = new PersonalContact(keyboard);
                contactList.add(p);
            }
            //if 3 is entered, and there are contacts in the contactList ArrayList, list the contacts.
            else if (input.equals("3") && contactList.size() > 0){
                
                do{
          
                    int index = 0;
                    
                    //Output Requirement: Display all contacts’ first and last names when the “display contacts” command is selected. 
                    //Todo: use index to display dynamic contact numeric key
                    System.out.println("[ CONTACT MENU ]");
                    for(Contact contact : contactList){
                        System.out.println(index + "\t" + contact.getFirstName() + " " +contact.getLastName());
                        index++;
                    }
                    
                    //Output Requirement: prompt that allows the user to enter the numeric key to display all details
                    System.out.println("Type the number that precedes the contact to see full details, or 'back' to go back to the Contact Menu:");
                    input = keyboard.readLine();
                    if(input.equals("back")){
                        break;
                    }
                    else{
                        try{
                            int contact = Integer.parseInt(input);
                            System.out.println("[ Contact Details ]");
                            Contact c = contactList.get(contact);
                            System.out.println(c.toString());
                        }
                        catch(NumberFormatException e){
                            
                            System.out.println("*** WARNING: You must enter a valid number or type 'back' to return to the Contact Menu ***");
                            System.out.println("");
                        }
                    }
                }while(!input.equals("quit") && !input.equals("q") );
                
                //Empty 'input' variable before exiting this loop, since it will still contain 'quit'/'q', and will unintentionally exit the next main menu loop as well.
                input = "";
            }
            else if (input.equals("3") && !(input.isEmpty())){
                //Error when user selectes "3" to display contacts, but contacts arraylist is empty.
                System.out.println("*** WARNING: You must create contacts before you can view. ***");
                System.out.println("");
            }
            else{
                //Catch all other user entries that do not match an option.
                System.out.println("*** WARNING: That entry is invalid. Please try again. ***");
                System.out.println("");
            }
            
        }while( !input.equals("quit") && !input.equals("q") );
    }
}