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
public class TT3_2_Help2 {
    
        public static void main(String[] args) throws java.io.IOException {
        
        char choice, ignore;
            
        do {
            System.out.println("Help on:");
            System.out.println("\t 1. if");
            System.out.println("\t 2. switch");
            System.out.println("\t 3. for");
            System.out.println("\t 4. while");
            System.out.println("\t 5. do-while\n");
            System.out.print("Choose one: ");
            System.out.println("");

            choice = (char) System.in.read();
            
            do {
                ignore = (char) System.in.read();
            } while(ignore != '\n');
        } while(choice < '1' | choice > '5');
            System.out.println("\n");
           
        switch (choice) {
                case '1': 
                    System.out.println("*************\nThe if : \n if (condition) statement; \n else statement;\n\n*************\n");
                    break;
                case '2': 
                    System.out.println("*************\nThe switch : \n switch(expression) {\n case constant: \n" +
                            " statement sequence \n break; \n } \n*************\n");
                    break;
                case '3': 
                    System.out.println("*************\nThe for : \n for (init; conditiona; iteration)\n (statement) \n } \n\n*************\n");
                    break;
                case '4': 
                    System.out.println("*************\nThe while : \n while(condition) Statement; \n } \n\n*************\n");
                    break;
                case '5': 
                    System.out.println("*************\nThe do-while : \n do {\n statement; \n" +
                            " } while (condition) ; \n\n*************\n");
                    break;


            }
        
        
        
    }
}