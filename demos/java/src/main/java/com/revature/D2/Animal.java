package com.revature.D2;

public class Animal {
    // Every class implicitly extends the Object class, so we have access to methods from that class like .equals or
    // .toString that every class can provide their own implementation for

    // When talking about inheritance it's important to remember things flow downwards from parents to children
    // meaning anything described here will be available to the child class

    // Recall to do encapsulation we mark fields as private and add getters/setters
    private String name;

    private int numOfLegs;

    private boolean canFly;


    public Animal(String name, int numOfLegs, boolean canFly) {
        this.name = name;
        this.numOfLegs = numOfLegs;
        this.canFly = canFly;
    }

    // Generic animal talk method
    public void talk(){
        //This will describe how a general animal might talk or make noise

        System.out.println("The animal made some noise");
    }


    @Override // Overriding the object class
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", numOfLegs=" + numOfLegs +
                ", canFly=" + canFly +
                '}';
    }

    // Getters and setters below
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
