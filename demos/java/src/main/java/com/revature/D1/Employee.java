package com.revature.D1;

public class Employee {

    // There are other modifiers outside of access modifiers that alter the way variables, methods, and classes act
    // These are called non-access modifiers

    // Three most important ones:
        // Static (methods and variables)
        // Final (classes, methods and variables)
        // Abstract (We'll cover tomorrow) (classes and methods)

    // Static scopes things to the class level (variables or methods) meaning they exist outside of any one instance
    private static String companyName = "Company X";

    private String name;

    // Final makes it so something becomes immutable (can't be changed)
    // Variables cannot be updated
    // Methods cannot be overridden (We'll talk about this tomorrow)
    // Classes cannot be extended (we'll talk about this tomorrow)
    // Final is like a stopping point, no changes are made passed that point
    private final String companyEmail;

    // We'll use this constructor to create our employee objects
    public Employee(String name, String companyEmail) {
        this.name = name;
        this.companyEmail = companyEmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // These methods are static since they're accessing a static variable (exist outside any one instance)
    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Employee.companyName = companyName;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

}
