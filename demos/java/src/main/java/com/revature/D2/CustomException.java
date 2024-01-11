package com.revature.D2;

public class CustomException extends Exception{

    // If we extend Exception we create a CHECKED exception
    // If we extend RuntimeException, we create an UNCHECKED exception


    public CustomException(String message) {
        super(message); // This allows us to write a custom message with our exception
    }
}
