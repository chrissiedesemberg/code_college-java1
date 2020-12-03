/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section8.LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author Chrissie
 */
public class Album {

    ArrayList<Song> songs;
    private String albumName;
    private String artist;

    Album(String albumName){
        this.albumName = albumName;
    };
    
    Album(String albumName, String artist) {
        this.songs = new ArrayList<Song>();
        this.albumName = albumName;
        this.artist = artist;
    }
    
     public boolean addNewSong(String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }
     
     public boolean removeCurrentSong(String title, double duration) {
        if (findSong(title) != null) {
            this.songs.remove(new Song(title, duration));
            return true;
        }
        return false;
    }
     
     private Song findSong(String title) {
        for (Song checkedSong: this.songs){
            if(checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
     }

     public boolean addToPlaylist(int trackNumber, LinkedList<Song> playList){
         int index = trackNumber -1;
         if ((index >= 0) && (index <= this.songs.size())) {
         playList.add(this.songs.get(index));
         return true;
         }
         System.out.println("This album does not have a track " + trackNumber);
         return false;
     }
     
     public boolean addToPlaylist(String title, LinkedList<Song> playList){
         Song checkedSong = findSong(title);
         if(checkedSong != null) {
         playList.add(checkedSong);
         return true;
         }
         System.out.println("The song \"" + title + "\" is not in this album");
         return false;
     }
     

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public String getAlbumName() {
        return albumName;
    }

   

    


//
//    public static void main(String[] args) {
//
//        LinkedList<Song> playList = new LinkedList<Song>();
//        
//    }
//
//    private static void printPlayList(LinkedList<String> linkedList) {
//        Iterator<String> i = linkedList.iterator();
//        while (i.hasNext()) {
//            System.out.println("Now listening --> " + i.next());
//        }
//        System.out.println("***************************");
//    }
//
//    private static void printMenu() {
//        System.out.println("Available actions - press: \n ");
//        System.out.println("0 - stop playing");
//        System.out.println("1 - to skip song");
//        System.out.println("2 - to go to previous song");
//        System.out.println("3 - to replay current song");
//        System.out.println("4 - remove current song");
//        System.out.println("5 - show menu");
//    }

}
