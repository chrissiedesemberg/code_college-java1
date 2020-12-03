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
public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    
    DeskPhone(int myNumber) {
        this.myNumber= myNumber;
    }
    
    @Override
    public void powerOn() {
        System.out.println("No action taken, no powerbutton on this phone");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on deskpthone.");
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
        if(phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ring Ring");
        }
        else {
        isRinging = false;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
 
    
    
    
    
}
