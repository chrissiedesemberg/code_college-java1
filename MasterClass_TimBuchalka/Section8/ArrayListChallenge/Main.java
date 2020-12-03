/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section8.ArrayListChallenge;

import java.util.Scanner;

/**
 *
 * @author Chrissie
 */
public class Main {
    
    private static final MobilePhone mobilePhone = new MobilePhone("082 461 5629");
    private static Scanner scanner = new Scanner(System.in);
    
    
    public static void main(String[] args) {
       
        boolean quit = false;
        startPhone();
        printActions();
        
        while (!quit) {
       
            System.out.println("\nEnter action - press 0 to show list of available actions: ");
            int action = scanner.nextInt();
            scanner.nextLine();
            
            switch (action) {
                case 0:
                    printActions();
                    break;
                case 1:
                    printListOfContacts();
                    break;
                case 2: 
                    addContact();
                    break;
                case 3: 
                    editContact();
                    break;
                case 4: 
                    removeContact();
                    break;
                case 5: 
                    findContact();
                    break;
                case 6:
                    System.out.println("Shutting down...");
                    quit = true;
                    break;
            }
        
        }
        
        
        
        
    }
    
        private static void startPhone() {
            System.out.println("Phone started...");
        }

    private static void printActions() {
        System.out.println("\nChoose an action: ");
        System.out.println("0 - Print choices");
        System.out.println("1 - Print full contact list");
        System.out.println("2 - add a contact");
        System.out.println("3 - edit a contact");
        System.out.println("4 - remove a contact");
        System.out.println("5 - find a contact");
        System.out.println("6 - to ShutDown");
    }

    private static void printListOfContacts() {
        mobilePhone.printContacts();
        
    }

    private static void addContact() {
        System.out.println("Adding contact: \nEnter new Contact name:");
        String name = scanner.nextLine();
        System.out.println("\nEnter phone number:");
        String number = scanner.nextLine();
        Contacts newContact = Contacts.createContact(name, number);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: " + name + ", phone " + number);
        }
        else System.out.println("Cannot add: " + name + ", already on file.");
        
    }

    private static void editContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
            System.out.println("Enter new contact name: ");
            String newName = scanner.nextLine();
            System.out.println("Enter new number: ");
            String newNumber = scanner.nextLine();
            Contacts newContact = Contacts.createContact(newName, newNumber);
        
        if (mobilePhone.modifyContactDetails(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record");}
        else {
            System.out.println("Error updating record");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
        return;
        }
        if (mobilePhone.removeContactDetails(existingContactRecord)) {
         System.out.println("Successfully deleted record");}
        else {
            System.out.println("Error deleting record");
        }
    }

    private static void findContact() {
    
    System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
        return;
        }
        System.out.println("Name " + existingContactRecord.getName() + ", phone number is " + existingContactRecord.getContactNumber());
    }



}
