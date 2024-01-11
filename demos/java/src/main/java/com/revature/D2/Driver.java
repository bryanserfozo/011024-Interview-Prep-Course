package com.revature.D2;

public class Driver {

    public static void main(String[] args) {


        // We're going to make a couple of animals
        Animal nemo = new Animal("Nemo", 0, false);

        Animal cat = new Animal("Shadow", 4, false);

        Animal polly = new Animal("Polly", 2, true);

        // We've described three very different animals here that should have different "abilities" or ways they
        // complete the abilities they do have

        nemo.talk();
        cat.talk();
        polly.talk();

        // To prove that Dog is an extension of the animal class we need to be able to verify it has the abilities and
        // fields associated with Animal

        Dog mya = new Dog("Mya", 4, "Boxer");

        mya.talk();
        // The dog class has inherited fields and methods from the animal class but we need to be able to update them
        // to become more specific for the dog

        Dog cash = new Dog("Cash", "Pit Bull");

        System.out.println(cash.getNumOfLegs()); // getNumOfLegs comes from parent class (Animal)

        System.out.println("-----------------------------");

        // Now we'll create an instance of our FirstResponder by using its implementing classes
        FirstResponder fr = new PoliceOfficer();
        // Liskov Substitution Principle (Interface/AbstractClass = new Implementation())
        // Makes it super easy if we wanted to switch implementations

        fr.respondToDispatcherCall();
        // Imagine there are 10-20 different methods being called, if I used a different class entirely there's no
        // guarantee the other class has the same methods or follows the same patterns so we used the abstract class
        // to guarantee it

        Uniformed ff = new Firefighter();
        // Firefighter implements uniformed so it is guaranteed to provide implementation for the abstract methods
        // outlined in uniformed.
    }
}
