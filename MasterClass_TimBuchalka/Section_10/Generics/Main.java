/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section_10.Generics;

/**
 *
 * @author Chrissie
 */
public class Main {
    
       // Create a generic class to implement a league table for a sport.
    // The class should allow teams to be added to the list, and store
    // a list of teams that belong to the league.
    //
    // Your class should have a method to print out the teams in order,
    // with the team at the top of the league printed first.
    //
    // Only teams of the same type should be added to any particular
    // instance of the league class - the program should fail to compile
    // if an attempt is made to add an incompatible team.
    
    public static void main(String[] args) {
        Player chrissie = new Player("Chrissie");
        Player melissa = new Player("Melissa");
        Player judd = new Player("Judd");
        
        
        Team <Player> juicers = new Team<>("Juicers");
        
        juicers.addPlayer(chrissie);
        juicers.addPlayer(melissa);
        juicers.addPlayer(judd);
        
        System.out.println(juicers.numPlayers());
        
        Team <Player> cranberries = new Team<>("Cranberries");
        
        Player peter = new Player("Peter");
        Player silke = new Player("Silke");
        Player tanja = new Player("Tanja");
        
        cranberries.addPlayer(peter);
        cranberries.addPlayer(silke);
        cranberries.addPlayer(tanja);
        
        
        Team <Player> sweettooth = new Team<>("Sweettooth");
        
        Player russell = new Player("Russell");
        Player ivan = new Player("Ivan");
        Player sharon = new Player("Sharon");
        
        sweettooth.addPlayer(russell);
        sweettooth.addPlayer(ivan);
        sweettooth.addPlayer(sharon);
        System.out.println(cranberries.numPlayers());
        

        
        
        League<Team> league1 = new League<>("League1");
        
        league1.add(juicers);
        league1.add(cranberries);
        league1.add(sweettooth);
        
        juicers.matchResult(cranberries, 1, 0);
        juicers.matchResult(sweettooth, 3, 2);
        
        cranberries.matchResult(juicers, 0, 2);
        cranberries.matchResult(sweettooth, 1, 1);
        
        sweettooth.matchResult(juicers, 1, 4);
        sweettooth.matchResult(cranberries, 0, 1);
        
        league1.showLeagueResults();
    }
    
}
