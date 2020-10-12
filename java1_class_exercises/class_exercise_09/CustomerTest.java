package exercise9;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chrissie
 */
public class CustomerTest {
    public static void main(String[] args) {
        
        Customer customerOne = new Customer("Dave Williams", "123345", "Married");
        String name;
        String ssn;
        String status;
        
        Customer customerTwo = new Customer("Susan Williams", "43256", "Single");
        
        String cust1_name = customerOne.getName();
        String cust1_ssn = customerOne.getSsn();
        String cust1_status = customerOne.getStatus();
        System.out.println(cust1_name);
        
        String cust2_name = customerTwo.getName();
        String cust2_ssn = customerTwo.getSsn();
        String cust2_status = customerTwo.getStatus();
        System.out.println(cust2_name);
        
    }
}
