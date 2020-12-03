/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section9.Innerclass;

/**
 *
 * @author Chrissie
 */
public class Song {
    
    private String title;
    private double duration;

    Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
    return this.title + " : " + this.duration;
    }
    
    
    
    
}
