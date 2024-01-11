package com.revature.D1;

public class Person {

    // Different attributes that might belong to each person
    // Name
    public String name; // Created a variable that will store our name value

    // Age
    int age;

    // Height
    protected double height;
    // Weight
    public double weight;

    // isMarried
    private boolean isMarried;

    // int, double, boolean are primitives, aka most basic data types we can have, like building blocks for
    // more complex datatypes. Prevent java from being fully object-oriented (since they're not objects).
    // Other primitives: float, long, char, byte, short

    // Numeric whole number types
    // byte, short, int, long

    // Floating numeric types (decimals)
    // Float, double

    // Character types
    // char

    // Boolean (true/false) types
    // boolean

    // String is not a primitive, it is a class that has methods and fields associated with it as well




    // Constructors
    // Special methods that exist within a class that allow us to
        // create an object
        // set its fields
    // When no constructor is defined, the default, no-arg constructor is used
    // We can specify a new constructor with no-args or all-args or some varying amount of arguments
    public Person(){
        // This is a no-args constructor
        isMarried = true;
    }

    public Person(String name, int age, boolean isMarried){
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
    }

    public Person(String name, int age, double height, double weight, boolean isMarried) {
        // This is an all-args constructor
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.isMarried = isMarried;
    }




    // Methods
    // Methods are essentially interchangeable with the word function
    // Describe a repeatable process that can be used with a variety of parameters
    // Things we need to specify when creating a method
        // Access Modifiers (We'll talk about this later)
        // Non-access Modifiers (We'll talk about this later)
        // Return type (Datatype that is returned from the function, if nothing then use void)
        // Method Name
        // Parameters


    // Different methods that describe what a person can do
    // Walk

    public String walk(int feet){
        String result = this.name + " walked a total of " + feet + " feet";
        return result;
    }


    // Talk
    public void talk(){
        System.out.println("Blah blah blah");
    }





}
