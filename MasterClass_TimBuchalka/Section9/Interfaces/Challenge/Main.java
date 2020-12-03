/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section9.Interfaces.Challenge;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Chrissie
 */
public class Main {
    
    public static void main(String[] args) {
        
        Players chrissie = new Players("Chrissie", 10, 15);
        System.out.println(chrissie.toString());
        saveObject(chrissie);
        
        chrissie.setHitPoints(8);
        System.out.println(chrissie);
        chrissie.setWeapon("axe");
        saveObject(chrissie);
        //loadObject(chrissie);
        System.out.println(chrissie);
        
        Monsters werewolf = new Monsters("Werewolf", 10, 15);
        System.out.println(werewolf.toString());
        saveObject(werewolf);
        
        
        
    }
    
    public static void savedObject(ISavable objectToSave) {
    for (int i=0; i<objectToSave.write().size(); i++) {
        System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
    }
    }
    
    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
    
    public static void saveObject(ISavable objectToSave) {
        for(int i=0; i< objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }
    
    public static void loadObject(ISavable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
    
}
