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
public class MobilePhone implements ITelephone{
  
    private int myNumber;
    private boolean isRinging;
    private boolean isOn;
    
    MobilePhone(int myNumber) {
        this.myNumber= myNumber;
    }
    
    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone is powered on");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
        System.out.println("Now ringing " + phoneNumber + " on mobile phone.");
    }   else {
            System.out.println("Phone is switched off");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering this phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Melody Ring");
        }
        else if (phoneNumber != myNumber) {
            System.out.println("Mobile number does not match your number");
            isRinging = false;
        }
        else {
            System.out.println("Mobile phone is off ");
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
 
    
    
    
    
}
