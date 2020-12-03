/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section8.BankingChallenge;

import java.util.ArrayList;

/**
 *
 * @author Chrissie
 */
public class Branch {
    
    private String branchName;
    private ArrayList <Customer> customers;

    Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    
    
    public String getBranchName() {
        return branchName;
    }
    
    public boolean newCustomer(String custName, double initialAmount) {
        if(findCustomer(custName) == null) {
            this.customers.add(new Customer(custName, initialAmount));
            return true;
        }
        else  {
        return false;}
    }
    
    public boolean addCustomerTransaction(String custName, double amount) {
            Customer existingCustomer  = findCustomer(custName);
            if(existingCustomer != null) {
                existingCustomer.addTransaction(amount);
                return true;
        }
        else  {
        return false;}
    }
    
    private Customer findCustomer(String custName) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getName().equals(custName)) {
            return checkedCustomer;}
        }
        return null;
    }


   
    
 
    
    
    
    
}