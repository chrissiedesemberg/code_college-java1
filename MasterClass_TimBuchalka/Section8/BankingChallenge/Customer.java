/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section8.BankingChallenge;

import java.util.ArrayList;
import java.text.DecimalFormat;

/**
 *
 * @author Chrissie
 */
public class Customer {
    
    private String name;
    ArrayList <Double> transactions = new ArrayList<Double>();
    
    private double accountBalance;
    DecimalFormat format = new DecimalFormat("##.00");

    
    
    //Constructors 
    public Customer(String name, double startingAccountBalance) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(startingAccountBalance);
  
    }
    
    public void addTransaction(double amount) {
    this.transactions.add(amount);
    }
    
    //Getters & Setters
    
    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    
    
}
