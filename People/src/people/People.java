/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author Poten
 */
public class People {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        /*This is the object*/
        Person amber = new Person("Amber Janosh",25,"123 Somewhere",
                "East Syracuse","New York",13057);
        
        Person myPeople [] = new Person[10];
        
                System.out.println(amber.getStreet());
                System.out.println(amber);
                
    }
    
}
