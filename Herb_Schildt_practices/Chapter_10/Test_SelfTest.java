/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Chrissie
 */
public class Test_SelfTest {

    public static void main(String[] args) {

        System.out.println("Question: 1\n");
//        1. Why does Java define both byte and character streams?
        System.out.println("\nByte streams are used to handle input and output "
                + "of bytes (i.e to read binary code). \n Character streams "
                + "handles character codes, and can be internationlized.\n");

        System.out.println("Question: 2\n");
//        2. Even though console input and output is text­based, why does Java still use 
//        byte streams for this purpose?
        System.out.println("\n\n");

        System.out.println("Question: 3\n");
//        3. Show how to open a file for reading bytes.
        System.out.println("FileInputStream fin = new FileInputStream(\"filename\");\n");

        System.out.println("Question 4: \n");
//        4. Show how to open a file for reading characters.
        System.out.println("\nFileReader fr = new FileReader(\"filename\")\n");

        System.out.println("Question 5: \n");
//        5. Show how to open a file for random­access I/O.
        System.out.println("\nRandomAccessFile(String filename, String access) "
                + "throws FileNotFoundException \n");

        System.out.println("Question 6: \n");
//        6. How can you convert a numeric string such as "123.23" into its 
//        binary equivalent? 
        System.out.println("\nby Using a parsing methods\n");

        System.out.println("Question 7: \n");
//        7. Write a program that copies a text file. In the process, 
//        have it convert all spaces into hyphens. Use the byte stream 
//        file classes. Use the traditional approach to closing a file 
//        by explicitly calling close( ).
        System.out.println("\n");

        int i;
        FileInputStream fileIn = null;
        FileOutputStream fileOut = null;
        
        if (args.length != 2) {
            System.out.println("File in - copy to.");
            return;
        }
        
        try {
            fileIn = new FileInputStream(args[0]);
            fileOut = new FileOutputStream(args[1]);
            do {
            i = fileIn.read();
            if ((char) i == ' ') i = '-';
            if(i != -1) fileOut.write(i);
            } while ( i != -1);
        }
        catch (IOException io) {
            System.out.println("I/O Exception: " + io);
        }
        finally {
        try {
            if (fileIn != null) fileIn.close();
                }
        catch (IOException io){
            System.out.println("Error when closing input File");
        }}

        try {
            if (fileIn != null) fileOut.close();
                }
        catch (IOException io){
            System.out.println("Error when closing output File");
        }
        
        System.out.println("\n");

        System.out.println("Question 8: \n");
//        8. Rewrite the program described in question 7 so that 
//        it uses the character stream classes. This time, use the try­with­resources 
//        statement to automatically close the file. 
        int j;
        
        if (args.length != 2) {
            System.out.println("File in - copy to.");
            return;
        }
        
        try (FileReader fileInj = new FileReader(args[0]);
            FileWriter fileOutj = new FileWriter(args[1]))
        {
            do {
            j = fileInj.read();
            if ((char) j == ' ') i = '-';
            if(j != -1) fileOutj.write(j);
            } while ( j != -1);
        }
        catch (IOException io) {
            System.out.println("I/O Exception: " + io);
        }
        
        
        System.out.println("\n");

        System.out.println("Question 9 : \n");
//        9. What type of stream is System.in?
        System.out.println("\nInput Stream\n");

        System.out.println("Question 10: \n");
//        10. What does the read( ) method of InputStream return when an attempt 
//        is made to read at the end of the stream?
        System.out.println("\nEither the amount of bytes read or -1\n");

        System.out.println("Question 11: \n");
//        11. What type of stream is used to read binary data?
        System.out.println("\nDataInputStream\n");

        System.out.println("Question 12: \n");
//        12. Reader and Writer are at the top of the ____________ class hierarchies.
        System.out.println("\ncharacter\n");

        System.out.println("Question 13: \n");
//        13. The try­with­resources statement is used for ___________ ____________ ____________.
        System.out.println("\nautomatic resource management\n");

        System.out.println("Question 14: \n");
//        14. If you are using the traditional method of closing a file, then 
//        closing a file within a finally block is generally a good approach. 
//        True or False?
        System.out.println("\nTrue\n");

        System.out.println("Question 15: \n");
//        15. Can local variable type inference be used when declaring the resource 
//        in a try­with­ resources statement? 
        System.out.println("\nYes it can be\n");

    }

}
