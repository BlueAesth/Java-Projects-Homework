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
public class Person /*This whole page is the class*/
{
    private String name;
    private int age;
private address myAddress;

    public Person() 
    {
    }

    public Person(String name, int age, String street, String city, String state, int zipCode) 
    {
        this.name = name;
        this.age = age;
        myAddress = new address(street, city, state, zipCode);

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStreet() {
        return myAddress.getStreet();
    }
    
    public void setStreet (String Street) {
        myAddress.setStreet(Street);
    }

    public String getCity() {
        return myAddress.getCity();
    }
    
     public void setCity (String City) {
        myAddress.setStreet(City);
    }

    public String getState() {
        return myAddress.getState();
    }

     public void setState (String State) {
        myAddress.setStreet(State);
    }
     
    public int getZipCode() {
        return myAddress.getZipCode();
    }

     public void setZipCode (String ZipCode) {
        myAddress.setStreet(ZipCode);
    }
    
    public void setName(String name) {
        this.name = name;
    }   
    

    public void setAge(int age) {
        this.age = age;
    }

    public void setMyAddress(address myAddress) {
        this.myAddress = myAddress;
    }
    
    

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", street=" + myAddress.getStreet()
                + ", city=" + myAddress.getCity() + ", state=" + myAddress.getState() + ", zipCode=" + myAddress.getZipCode() + '}';
    }
    
    
    
}
