/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9.TT9_1;

import Chapter9.*;

/**
 *
 * @author Chrissie
 */
public class QueueFullException extends Exception{
    int size;
    
    QueueFullException(int s) {size = s;}
    
    public String toString() {
    return "\n Queue is full. Maximum size is " + size;
    }
}
