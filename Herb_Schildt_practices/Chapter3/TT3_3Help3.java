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
public class TT3_3Help3 {
        
    public static void main(String[] args) throws java.io.IOException {
        
        char choice, ignore;

        for (;;) {
            do {
                System.out.println("Help on:");
                System.out.println("\t 1. if");
                System.out.println("\t 2. switch");
                System.out.println("\t 3. for");
                System.out.println("\t 4. while");
                System.out.println("\t 5. do-while");
                System.out.println("\t 6. break");
                System.out.println("\t 7. continue\n");
                System.out.print("Choose one: (q to quit) ");
                System.out.println("");

                choice = (char) System.in.read();
  
                do {
                    ignore = (char) System.in.read();
                } while(ignore != '\n');
            } while( choice < '1' | choice > '7' & choice != 'q');

            if(choice == 'q') break;
            
            switch (choice) {
                    case '1': 
                        System.out.println("*************\n\nThe if : \n if (condition) statement; \n else statement;\n\n*************\n");
                        break;
                    case '2': 
                        System.out.println("*************\n\nThe switch : \n switch(expression) {\n case constant: \n" +
                                " statement sequence \n break; \n } \n*************\n");
                        break;
                    case '3': 
                        System.out.println("*************\n\nThe for : \n for (init; conditiona; iteration)\n (statement) \n } \n\n*************\n");
                        break;
                    case '4': 
                        System.out.println("*************\n\nThe while : \n while(condition) Statement; \n } \n\n*************\n");
                        break;
                    case '5': 
                        System.out.println("*************\n\nThe do-while : \n do {\n statement; \n" +
                                " } while (condition) ; \n\n*************\n");
                        break;
                    case '6': 
                        System.out.println("*************\n\nThe break : \n break;  or break label \n\n*************\n");
                        break;
                    case '7': 
                        System.out.println("*************\n\nThe continue : \n continue; or continue label; \n\n*************\n");
                        break;
                }
            System.out.println("");
        }

    }
}