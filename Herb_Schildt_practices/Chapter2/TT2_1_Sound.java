/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter2;

/**
 *
 * @author Chrissie
 */
public class TT2_1_Sound {
    public static void main(String[] args) {
        double timeInterval = 7.20;
        double soundEcho = 3.6;
        int soundSpeedFtSec = 1100;
        double calculatedDistance = timeInterval * soundSpeedFtSec;
        double feetToWall;
        
        feetToWall = (soundEcho/2) * soundSpeedFtSec;
        
        System.out.println("The lightening hit the ground about " + 
                calculatedDistance + " feet from your location.");
        System.out.println("");
        System.out.println("The distace to the large rock face is: " + 
                feetToWall + " feet to your location.");
        
    }
   
}
