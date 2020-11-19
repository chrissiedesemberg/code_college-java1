/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5;

/**
 *
 * @author Chrissie
 */
public class ForEach2 {

    public static void main(String[] args) {

        //create array & give values
        int nums[][] = new int[3][5];
        int i, j;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 5; j++) {
                nums[i][j] = (i + 1) * (j + 1);
            }
        }

        // use forEach to display and sum values
        int sum = 0;
        for (int[] x : nums) {
            for (int y : x) {
                System.out.println("Value is: " + y);
                sum += y;
            }
        }
        System.out.println("Summary is: " + sum);

    }
}
