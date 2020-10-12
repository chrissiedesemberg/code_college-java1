/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise11;
import java.time.LocalDate;
import java.time.format.*;
/**
 *
 * @author Chrissie
 */
public class exercise11_1 {
    public static void main(String[] args) {
        LocalDate datePrinted = LocalDate.now();
        System.out.println("Date and time printed: " + datePrinted);
        
        String dateFormatted = datePrinted.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Date and time printed: " + datePrinted);
    }
}
