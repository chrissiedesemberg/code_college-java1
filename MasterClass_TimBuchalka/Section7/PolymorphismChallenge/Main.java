/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section7.PolymorphismChallenge;

/**
 *
 * @author Chrissie
 */
public class Main {

    public static void main(String[] args) {
        
        Car carObj = new Car("WOOOOW", 8);
        System.out.println(carObj.startEngine());
        System.out.println(carObj.brake());
        System.out.println(carObj.accelerate());
        
        
        Atos atosCar = new Atos("Car make", 2, 156, 1, 5);
        System.out.println(atosCar.startEngine());
        System.out.println(atosCar.brake());
        System.out.println(atosCar.accelerate());
        
        Porsche porche = new Porsche("Car make", 5, 12, 6, 3);
        System.out.println(porche.startEngine());
        System.out.println(porche.brake());
        System.out.println(porche.accelerate());
        
        Subaru subaru = new Subaru("Car make", 5, 12, 6, 5);
        System.out.println(subaru.startEngine());
        System.out.println(subaru.brake());
        System.out.println(subaru.accelerate());

    }

}
