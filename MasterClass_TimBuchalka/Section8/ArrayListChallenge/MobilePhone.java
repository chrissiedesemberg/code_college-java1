/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section8.ArrayListChallenge;

import java.util.ArrayList;

/**
 *
 * @author Chrissie
 */
public class MobilePhone {

    private String myNumber;
    private ArrayList<Contacts> myContacts;
    int i;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
    }

    public boolean addNewContact(Contacts contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    private int findContact(Contacts contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (i = 0; i < this.myContacts.size(); i++) {
            Contacts contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contacts contact) {
        if (findContact(contact) <= 0) {
            return contact.getName();
        }
        return null;
    }
    public Contacts queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public boolean modifyContactDetails(Contacts oldContact, Contacts newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " was not found");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContactDetails(Contacts contactName) {
        int foundPosition = findContact(contactName);
        if (foundPosition < 0) {
            System.out.println(contactName.getName() + " was not found");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contactName.getName() + ", was deleted");
        return true;
    }

    public void printContacts() {
        System.out.println("Contact List: ");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println(i+1 + "." + 
                    this.myContacts.get(i).getName() + " - " +
                    this.myContacts.get(i).getContactNumber());
        }
    }
    }

