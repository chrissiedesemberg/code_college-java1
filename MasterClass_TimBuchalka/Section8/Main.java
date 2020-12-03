/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section8;

import java.util.Scanner;

/**
 *
 * @author Chrissie
 */
public class Main {

    private static GroceryList groceryList = new GroceryList();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;

        printInstructions();

        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    findItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }

        }
    }
        
        public static void printInstructions(){
            System.out.println("\nPress ");
            System.out.println("\n0 - to print choice options ");
            System.out.println("\n1 - to print the list of items ");
            System.out.println("\n2 - to add an item to the list ");
            System.out.println("\n3 - to modify an item in the list ");
            System.out.println("\n4 - to remove an item from the list ");
            System.out.println("\n5 - to search the list for an item");
            System.out.println("\n6 - to quit ");
        }

        public static void addItem() {
            System.out.print("Please enter grocery item: ");
            groceryList.addGroceryItem(scanner.nextLine());
        }
        
        public static void removeItem() {
            System.out.print("Please enter grocery item number to remove: ");
            String itemNumber = scanner.nextLine();
            scanner.nextLine();
            groceryList.removeGroceryItem(itemNumber);
        }
        
        public static void modifyItem() {
            System.out.print("Current item name to modify: ");
            String itemNumber = scanner.nextLine();
            scanner.nextLine();
            System.out.println("Enter new item name: ");
            String newItem = scanner.nextLine();
            groceryList.modifyGroceryItem(itemNumber, newItem);
        }
        
        
        public static void printList() {
            groceryList.printGroceryList();
        }
        
        public static void findItem() {
            System.out.print("Please enter grocery item to find: ");
            String searchItem = scanner.nextLine();
            if (groceryList.onFile(searchItem)) {
                System.out.println("Found " + searchItem + " in the list.");
            }
            else {
                System.out.println("Did not find " + searchItem + " in the list.");
            }
        }
}

