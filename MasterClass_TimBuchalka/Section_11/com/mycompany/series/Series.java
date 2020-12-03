/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section_11.com.mycompany.series;

/**
 *
 * @author Chrissie
 */
public class Series {

    public static long nSum(int n) {
        return n * (n + 1) / 2;
    }

    public static long f(int n) {
        if (n == 0) {
            return 0;
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static long fibonacci(int n) {
        int bef = 0, aft = 1;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            System.out.println(bef);
            sum = bef + aft;
            bef = aft;
            aft = sum;
        }
        return bef;
    }

}
