/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section4;

/**
 *
 * @author Chrissie
 */
public class Challenge_Player {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("William Shatner", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Adam Reader", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Evan Green", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Suzi Philantro", highScorePosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;

    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position "
                + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {

        int positionOnTable = 4;
        
        if (playerScore >= 1000) {
            positionOnTable = 1;
        }
        else if (playerScore >= 500) {
            positionOnTable = 2;
        }
        else if (playerScore >= 100) {
            positionOnTable = 3;
        }
             
        return positionOnTable;
        }

}
    

