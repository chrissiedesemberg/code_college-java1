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
public class Contacts {
    
    private String contactNumber;
    private String name;
    
    Contacts(String name, String number) {
        this.name = name;
        this.contactNumber = number;
        
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getName() {
        return name;
    }
    
    public static Contacts createContact(String name, String phone) {
     return new Contacts(name, phone);}
    
    
    
   
    
   
    
    
    
    
    
    
}
