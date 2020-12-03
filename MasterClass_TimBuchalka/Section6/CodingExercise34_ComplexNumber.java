/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section6;

/**
 *
 * @author Chrissie
 */
public class CodingExercise34_ComplexNumber {
    
    public static void main(String[] args) {
        CodingExercise34_ComplexNumber one = new CodingExercise34_ComplexNumber(1.0, 1.0);
        CodingExercise34_ComplexNumber number = new CodingExercise34_ComplexNumber(2.5, -1.5);        
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
         System.out.println("one.imaginary= " + one.getImaginary());
         
        one.subtract(number);
                System.out.println("one.real= " + one.getReal());
         System.out.println("one.imaginary= " + one.getImaginary());
         
         number.subtract(one);
                 System.out.println("number.real= " + number.getReal());
         System.out.println("number.imaginary= " + number.getImaginary());
        
    }
    
    private double real;
    private double imaginary;
    
    public CodingExercise34_ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
    
    public void add(double real, double imaginary) { 
        this.real = (this.real + real);
        this.imaginary = (this.imaginary + imaginary);
    }
    
     public void add(CodingExercise34_ComplexNumber cn) { 
        this.real = (this.real + cn.getReal());
        this.imaginary = (this.imaginary + cn.getImaginary());
    }
    
    public void subtract(double real, double imaginary) { 
        this.real = (this.real - real);
        this.imaginary = (this.imaginary - imaginary);
    }
    
        public void subtract(CodingExercise34_ComplexNumber cn) { 
        this.real = (this.real - cn.getReal());
        this.imaginary = (this.imaginary - cn.getImaginary());
    }

}
