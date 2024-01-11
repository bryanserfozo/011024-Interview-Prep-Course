package com.revature.D2;

// Inherits the animal class (meaning it gets its fields and its methods)
public class Dog extends Animal{

    private String breed;

    // This constructor allows us to create a parent object which is the "starting point" for building this object
    public Dog(String name, int numOfLegs, String breed) {
        super(name, numOfLegs, false);
        this.breed = breed;
    }


    // The dog class successfully inherited the fields and methods from the parent class Animal, but now we need to
    // tailor them to make specific to a dog

    // We'll achieve this through Polymorphism

    // Overriding
    // Override parent class functionality for our own uses
    @Override
    public void talk() {
        // super.talk(); This was initial functionality, just called parent class's talk method
        System.out.println("Bark Bark Bark");
    }


    // Overloading
    // Multiple methods with the same name with varying parameters

    // Does anybody know of a time we've already used overloading?
    // Answer: Constructors

    // If I created another constructor the method would be OVERLOADED because I have two methods with the same name
    // But different functionality and parameters

    public Dog(String name, String breed) {
        super(name, 4, false); // Calls parent class constructor
        this.breed = breed;
    }














    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
