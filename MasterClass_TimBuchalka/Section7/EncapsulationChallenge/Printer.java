/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section7.EncapsulationChallenge;

/**
 *
 * @author Chrissie
 */
public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {

        //tonerLevel
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        //pages printed
        this.pagesPrinted = 0;

        // can print both sides?
        this.duplexPrinter = duplexPrinter;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }

    public int fillUpToner(int tonerAmount) {

        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            System.out.println("Toner has been filled up - toner level is: " + tonerLevel);
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPage(int pages) {

        int pagesToPrint = pages;
        if (this.duplexPrinter == true) {
            pagesToPrint = (pages / 2) + (pages % 2);
            pagesPrinted += pagesToPrint;
            System.out.println("Printed on back and front pages - pages printed " + pagesToPrint);
        } else {
            pagesPrinted += pagesToPrint;
            System.out.println(pages + " pages now printed, total pages printed " + pagesPrinted);
        }

        return pagesToPrint;

    }

    public static void main(String[] args) {

        Printer printer = new Printer(50, true);

        printer.fillUpToner(15);
        printer.printPage(80);

    }

}
