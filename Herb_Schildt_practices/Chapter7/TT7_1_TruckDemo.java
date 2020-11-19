/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7;

/**
 *
 * @author Chrissie
 */
public class TT7_1_TruckDemo  {
    
    public static void main(String[] args) {
        
    Truck medTruck  = new Truck(3, 2000, 5, 30000);  
    Truck bakkie = new Truck (6, 500, 8, 1000); 
    double liters;
    int distance = 252;
   
    liters = medTruck.fuelneeded(distance);
        System.out.println("medTruck can carry " + medTruck.getCargo() + " kgs");
        System.out.println("To go " + distance + " kilometers the medTruck needs " + 
                liters + " of fuel.\n");
        
        liters = bakkie.fuelneeded(distance);
        
                System.out.println("bakkie can carry " + bakkie.getCargo() + " kgs");
        System.out.println("To go " + distance + " kilometers the bakkie needs " + 
                liters + " of fuel.\n");
  }  
    
    
}
