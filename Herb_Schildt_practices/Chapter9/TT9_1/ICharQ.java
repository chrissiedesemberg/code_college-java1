/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9.TT9_1;

import Chapter9.QueueFullException;
import Chapter9.QueueEmptyException;


/**
 *
 * @author Chrissie
 */

public interface ICharQ {

void put (char ch) throws QueueFullException;
char get() throws QueueEmptyException;

}
