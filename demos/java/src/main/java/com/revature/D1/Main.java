package com.revature.D1;

public class Main {

    // Main method
    // Entry point to the application
    // Essentially outlines everything we want to "run" in our application
    public static void main(String[] args){
        // When we click the play button, everything in here will run

        // First thing we should always do when starting a new programming language
        System.out.println("Hello World!"); // Strings are wrapped in ""

        // We can create information and store it in a variable for later use
        int num = 10;

        num = 11;

        num = num + 3; // Set the value of num to 14

        System.out.println(num);

        // What do we need to do if we wanted to create a person object?
        Person bryan = new Person();
        // Datatype variableName = new Datatype()

        // If we wanted to access the variables associated with the person bryan we could do like so
        System.out.println(bryan.name);
        bryan.name = "bryan";
        bryan.age = 25;
//        bryan.isMarried = false;

        System.out.println(bryan.name);
        System.out.println(bryan.age);
//        System.out.println(bryan.isMarried);


        System.out.println("-------------------------------");

        // Person() from the line above is called a Constructor (no-arg constructor)
        // A constructor is a function used to instantiate an object and can be used to set specific fields

        // Let's take a look at our constructors in action
        Person john = new Person(); //No-args
        System.out.println(john.name);
        System.out.println(john.height);
//        System.out.println(john.isMarried);

        // I can use my all-args constructor to set each individual field with a value
        Person jane = new Person("Jane Doe", 27, 5.75, 145, false);
        System.out.println(jane.name);
        System.out.println(jane.height);

        // We could use our other constructor as needed
        Person kaitlyn = new Person("Kaitlyn", 25, false);
        System.out.println(kaitlyn.name);
        System.out.println(kaitlyn.height);

        // We can use the methods we defined in our Person class on our people
        System.out.println("-------------------------");
        kaitlyn.walk(3); // This guy returns a string, we need to do something with that string if we want
                            // to print it or do something similar (i.e. pass to another method or store in variable)

        System.out.println(kaitlyn.walk(3));

        kaitlyn.talk(); // This method has a return type of void, so nothing is returned


        System.out.println("-------------------------");
        // Let's create some objects to work with our getters and setters
        Product skateboard = new Product(); // Recall the default constructor
        // Now to access the fields inside of the skateboard object I need to use the mutators
        skateboard.setProductName("Skateboard");
        System.out.println(skateboard.getProductName());

        // Why do we even NEED to encapsulate our classes? What's the point?
        // skateboard.price = -1; // This doesn't make sense, we don't want this to happen
        skateboard.setPrice(-1);
        System.out.println(skateboard.getPrice());

        System.out.println("-------------------------");

        // So let's create a couple employee objects and check some info
        Employee emp1 = new Employee("Bryan", "bryan@revature.com");
        Employee emp2 = new Employee("Charles", "charles@revature.com");
        Employee emp3 = new Employee("Dan", "dan@revature.com");

        // Company got bought and now the name has been changed
        Employee.setCompanyName("Revature");

        // Let's print out the name of each employee and the company they work at
        System.out.println(emp1.getName());
        System.out.println(emp1.getCompanyName());
        System.out.println(emp2.getName());
        System.out.println(emp2.getCompanyName());
        System.out.println(emp3.getName());
        System.out.println(emp3.getCompanyName());

        // The way I usually think about static is like electricity on your block
        // If you lose power usually the neighbors lose power too
        // When you get power back, their neighbors do as well
        // The "power" is static, the same value of "power" (on/off) is shared by the houses on the block


        // Final variables are good for things you don't want to change down the line, good for constants
        emp1.setName("bryan graves");
        // We cannot access the email in a way that we could change it, since final marked it as read-only once it was
        // assigned a value
    }


}
