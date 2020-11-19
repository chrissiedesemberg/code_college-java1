/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section4;

/**
 *
 * @author Chrissie
 */
public class Challenge_Seconds_Minutes {
    
    public static void main(String[] args) {
        
        String result = getDurationString(124, 60);
        System.out.println("Result: " + result);
        String result2 = getDurationString(4000);
        System.out.println("Result: " + result2);
        
    }
    
    
    public static String getDurationString(int minutes, int seconds){
        long hours = minutes / 60;
        long remainderMinutes = minutes % 60;
        
        if (minutes >= 0 && seconds >= 0 && seconds <= 59){ 
        return hours+"h "+remainderMinutes+"m "+seconds+"s";
        }
        else return "Invalid value"; 
    }
    
    public static String getDurationString(int seconds){
        if (seconds >= 0) {
            int minutes = seconds / 60;
            int remainderSeconds = seconds % 60;
            return getDurationString(minutes, remainderSeconds);  
        }
        return "Invalid Value";
    }
}
