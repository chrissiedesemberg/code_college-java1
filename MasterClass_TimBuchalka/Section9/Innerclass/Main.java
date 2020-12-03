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
public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Black", "Metallica");
        album.addNewSong("Track1", 1.2);
        album.addNewSong("Track2", 1.3);
        album.addNewSong("Track3", 1.7);
        album.addNewSong("Track4", 2.2);
        album.addNewSong("Track5", 4.5);
        album.addNewSong("Track6", 5.1);
        album.addNewSong("Track7", 1.5);
        album.addNewSong("Track8", 2.1);
        albums.add(album);

        Album album1 = new Album("SciFicGames", "Chevelle");
        album.addNewSong("Track1", 1.2);
        album.addNewSong("Track2", 1.3);
        album.addNewSong("Track3", 1.7);
        album.addNewSong("Track4", 2.2);
        album.addNewSong("Track5", 4.5);
        album.addNewSong("Track6", 5.1);
        album.addNewSong("Track7", 1.5);
        album.addNewSong("Track8", 2.1);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlaylist("Track1", playList);
        albums.get(0).addToPlaylist("Track10", playList);
        albums.get(1).addToPlaylist("Track4", playList);
        albums.get(0).addToPlaylist(10, playList);
        albums.get(0).addToPlaylist("Track6", playList);
        albums.get(1).addToPlaylist("Track8", playList);
        albums.get(0).addToPlaylist("Track1", playList);
        albums.get(1).addToPlaylist("Track1", playList);

        play(playList);
    }

    public static void play(LinkedList<Song> playList) {
        printMenu();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean playingNextSong = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in playlist.");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist now stopped");
                    quit = true;
                    break;
                case 1:
                    if (!playingNextSong) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        playingNextSong = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing: " + listIterator.next().toString());
                    } else {
                        System.out.println("Reached the end of the playlist");
                        playingNextSong = false;
                    }
                    break;
                case 2:
                    if (playingNextSong) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        playingNextSong = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing: " + listIterator.previous().toString());
                    } else {
                        System.out.println("Reached the start of the playlist - cannot go back");
                        playingNextSong = true;
                    }
                    break;
                case 3:
                    if (playingNextSong) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            playingNextSong = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            playingNextSong = true;
                        } else {
                            System.out.println("We are at the end of the list");
                        }
                    }

                    break;
                case 4:

                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() > 0) {
                        listIterator.remove();
                        System.out.println("Deleted track: " + listIterator.toString());
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nChoose an action: ");
        System.out.println("0 - Quit");
        System.out.println("1 - Play next song");
        System.out.println("2 - Play Previous song");
        System.out.println("3 - Replay current song");
        System.out.println("4 - Print play list");
        System.out.println("5 - Print menu");
        System.out.println("6 - Delete current song off playlist");
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("=======================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
            System.out.println("=======================");
        }
    }

}
