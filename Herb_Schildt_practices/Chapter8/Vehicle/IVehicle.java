/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8.Vehicle;

/**
 *
 * @author Chrissie
 */
public interface IVehicle {

  // This is a constructor for IVehicle. 
  int Vehicle(int p, int f, int m); 
 
  // Return the range.  
  int range();
  
  // Compute fuel needed for a given distance. 
  double fuelneeded(int miles);
    
}
