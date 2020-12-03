/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section9.Interfaces.Challenge;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Chrissie
 */
public interface ISavable {
    
    List<String> write();
    void read(List<String> savedValues);
 
}
