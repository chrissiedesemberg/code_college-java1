/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Chrissie
 */
public class TT10_2_FileHelp {

 
    
    public static void main(String[] args) {
        
        Help helpObj = new Help("helpfile.txt");
        String topic;
        
        System.out.println("Try the help system. \nEnter 'stop' to end. ");
        
        do{
            topic = helpObj.getSelection();
            if (!helpObj.helpOn(topic)) 
                System.out.println("Topic not found.\n");
        } while (topic.compareTo("stop") != 0);
    }
    
}
