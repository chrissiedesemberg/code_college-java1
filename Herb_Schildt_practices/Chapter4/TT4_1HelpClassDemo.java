/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4;

/**
 *
 * @author Chrissie
 */
public class TT4_1HelpClassDemo {

    public static void main(String[] args) throws java.io.IOException {

        char choice, ignore;
        TT4_1ClassHelp helpObject = new TT4_1ClassHelp();

        for (;;) {
            do {
                helpObject.showMenu();
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!helpObject.isValid(choice));

            if (choice == 'q') {
                break;
            }
            System.out.println("\n");

            helpObject.helpOn(choice);

        }
    }

}
