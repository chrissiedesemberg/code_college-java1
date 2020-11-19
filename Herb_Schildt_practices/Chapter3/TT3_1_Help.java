/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3;

/**
 *
 * @author Chrissie
 */
public class TT3_1_Help {
    public static void main(String[] args) throws java.io.IOException {
        System.out.println("Help on:");
        System.out.println("\t 1. if");
        System.out.println("\t 2. switch");
        System.out.print("Choose one: ");
        System.out.println("");
        System.out.println("");
        
        int choice = (char) System.in.read();
        
        switch (choice) {
            case '1': 
                System.out.println("*************\nThe if : \n if (condition) statement; \n else statement;\n*************\n");
                break;
            case '2': 
                System.out.println("*************\nThe switch : \n switch(expression) {\n case constant: \n" +
                        " statement sequence \n break; \n } *************\n");
                break;   
            default: 
                System.out.println("Selection not found");
        
        }
        
        
        
    }
}
