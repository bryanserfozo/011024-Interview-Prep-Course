package com.revature.access;

import com.revature.D1.Main;
import com.revature.D1.Person;

public class AccessModifierDriver{

    public static void main(String[] args) {
        // We'll utilize this package to essentially test whether we can see variables from the person class

        Person stephen = new Person();
        stephen.name = "stephen";
        // stephen.age = 26; No longer works since this was marked with the default access modifier
        // Default makes it so it is only available in the same package
        // stephen.height = 5.75;
        stephen.weight = 170;
        // stephen.isMarried = true; Private makes it only accessible within the class itself


    }
}
