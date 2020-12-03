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
public class CodingExercises30_Person {
    
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) this.age = 0;
        
        else this.age = age;
    }
    
    public boolean isTeen(){
        if (age < 13 || age > 19) return false;
        
        return true;
    }
    
    public String getFullName() {
    
        if (firstName.isEmpty() && lastName.isEmpty()) return "";
        else if (lastName.isEmpty()) return firstName;
        else if (firstName.isEmpty()) return lastName;
        
        return firstName + " " + lastName;
    }
    
    
}
