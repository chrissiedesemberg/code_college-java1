/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section9.AbstractClass;

/**
 *
 * @author Chrissie
 */
public abstract class ListItem {
    
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);
    
    abstract int compareTo(ListItem item);
    
    public Object getValue() {
    return value;
    }
    
    public void setValue(Object value) {
    this.value = value;
    }
    
    
}
