/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise8_pg295.Calculator;

/**
 *
 * @author Chrissie
 */
public class CalculatorTest {
    public static void main(String[] args) {
        
        int totalOne = Calculator.sum(2, 3);
        System.out.println("The total is " + totalOne);
        
        float totalTwo = Calculator.sum(15.99F, 12.85F);
        System.out.println(totalTwo);
        
        float totalThree = Calculator.sum(2, 12.85F);
        System.out.println(totalThree);

    }
}

