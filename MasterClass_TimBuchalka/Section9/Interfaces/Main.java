/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section9.Interfaces;

/**
 *
 * @author Chrissie
 */
public class Main {
    
    public static void main(String[] args) {
        
        // ITelephone // DeskPhone
        
        ITelephone chrissiesPhone;
        chrissiesPhone = new DeskPhone(1234);
        chrissiesPhone.powerOn();
        chrissiesPhone.isRinging();
        chrissiesPhone.callPhone(1234);
        chrissiesPhone.answer();
        chrissiesPhone.isRinging();
        
        System.out.println("");
        System.out.println("");
        
        chrissiesPhone = new MobilePhone(23456);
        chrissiesPhone.callPhone(1234);
        chrissiesPhone.callPhone(23456);
        chrissiesPhone.powerOn();
        chrissiesPhone.isRinging();
        chrissiesPhone.callPhone(23456);
        chrissiesPhone.answer();
        chrissiesPhone.isRinging();
        
        
        
        
    }
    
}
