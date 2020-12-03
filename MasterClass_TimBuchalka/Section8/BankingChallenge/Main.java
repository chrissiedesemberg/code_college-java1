/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section8.BankingChallenge;

import java.util.Scanner;

/**
 *
 * @author Chrissie
 */
public class Main {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Bank bank = new Bank("FNB");
        bank.addBranch("Centurion");
        bank.addCustomer("Centurion", "Chrissie", 100.05);
        bank.addCustomer("Centurion", "Melissa", 200.12);
        bank.addCustomer("Centurion", "Peter", 1000.50);

        bank.addBranch("Little Germany");
        bank.addCustomer("Little Germany", "Johnny", 100.05);
        bank.addCustomer("Little Germany", "Tanja", 200.12);
        bank.addCustomer("Little Germany", "PeterAllan", 1000.50);
        bank.addCustomer("Little Germany", "Silke", 2000.50);

        bank.addCustomerTransaction("Little Germany", "Johnny", 44.15);
        bank.addCustomerTransaction("Little Germany", "Johnny", -50.4);
        bank.addCustomerTransaction("Centurion", "Melissa", 1000.4);

        bank.listCustomers("Little Germany", true);
        bank.listCustomers("Centurion", true);
    }

}
