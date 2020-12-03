/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section9.Innerclass;

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

    private String albumName;
    private String artist;
    private SongList songs;
    
    Album(String albumName) {
        this.albumName = albumName;
    }

    ;
    
    Album(String albumName, String artist) {
        this.songs = new SongList();
        this.albumName = albumName;
        this.artist = artist;
    }

    public boolean addNewSong(String title, double duration) {
        return this.songs.add(new Song(title, duration));
    }
    
    public boolean removeCurrentSong(String title, double duration) {
        if (this.songs.findSong(title) != null) {
            this.songs.remove(new Song(title, duration));
            return true;
        }
        return false;
    }

    

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playList) {
        Song checkedSong = this.songs.findSong(trackNumber);
        if (checkedSong != null) {
            playList.add(checkedSong);
        return true;
        }else {
        System.out.println("This album does not have a track " + trackNumber);
        return false;
        }
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playList) {
        Song checkedSong = songs.findSong(title);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song \"" + title + "\" is not in this album");
        return false;
    }
    

     



    public String getAlbumName() {
        return albumName;
    }

    private class SongList {

        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public boolean add(Song song) {
            if (songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        public boolean remove(Song song) {
                this.songs.remove(song);
            return true;
            }
      
        private Song findSong(String title) {
            for (Song checkedSong : this.songs) {
                if (checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }
        
         private Song findSong(int trackNumber) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index < songs.size())) {
            return songs.get(index);
        }
        return null;
    }
        

    }

}
