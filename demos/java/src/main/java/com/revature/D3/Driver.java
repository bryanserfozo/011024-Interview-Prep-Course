package com.revature.D3;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    static final ExampleClass ex = new ExampleClass("Example Title");

    public static void main(String[] args) {
        System.out.println(ex);

        // Attempting to change the object (not the reference) via getters and setters

        ex.setTitle("Different title");

        System.out.println(ex);

        // Creating a new example class object
        ExampleClass ex2 = new ExampleClass("Different Object entirely");

        // ex = ex2; // This doesn't work since we cannot change the reference of final variable

        String result = "Hello World";

        result += "!"; // Since strings are immutable this will actually create a whole new object

        ExampleClass.staticMethod();
        ExtensionClass.staticMethod(); // This method has not been overridden but shadowed instead

        List<Integer> numbers = new ArrayList<>();
    }
}
