/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Chrissie
 */
public class GroceryList {
    

     private final ArrayList<String> groceryList = new ArrayList<String>();
  
    private static void printInstructions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }
    
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));}
    }
    
    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }
    
    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findGroceryItem(newItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }
    
        public void removeGroceryItem(String item) {
        int position = findGroceryItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }
    
    private void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }
    
    private int findGroceryItem(String searchItem) {
        searchItem = searchItem.toLowerCase();
        return groceryList.indexOf(searchItem);
    }
    
    public boolean onFile(String searchItem) {
        int position = findGroceryItem(searchItem);
        
        if (position >= 0) {
        return true;
        }
        else {
            return false;
        }
        
    }
    
    
}
