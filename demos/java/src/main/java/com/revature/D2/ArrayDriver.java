package com.revature.D2;

import java.io.IOException;

public class ArrayDriver {

    public static void main(String[] args) {
        // Arrays are ways for us to store multiple pieces of data in one structure.
        // In java, generally the data has to be of a single type (except niche scenarios)
        // Arrays hold multiple pieces of data in an ordered, indexed structure that cannot be resized

        // Let's create an array of integers
        int[] examScores = new int[4]; // capacity of 4

        // Indexed things start at 0 in any self-respecting programming language
        examScores[0] = 91;
        examScores[1] = 84;
        examScores[2] = 95;
        examScores[3] = 91;

        System.out.println("The program is running");
        // Let's try to add another item
//        examScores[4] = 100; // not possible since length is 4 so indexing goes from 0-3
        System.out.println("The program is running");

        // Arrays are cool since we can iterate over them
        // Let's find the average of this person's test scores
        double avg = 0;
        for (int i = 0; i < examScores.length; i++){
            avg += examScores[i];
        }
        avg /= examScores.length;

        System.out.println(avg);


        // One thing we saw a few minutes ago was the IndexOutOfBounds exceptions that was thrown when we tried to
        // access an index that the array didn't have

        // Exceptions are thrown usually when things go "wrong" either by user error or developer error
        // Checked Exceptions --> Checked by the compiler before the code can be run
        // Unchecked Exceptions --> Happen during run time and cause the program to halt

        // How do we handle an exception?
        // We use a try-catch block that allows us to catch any error and prevent the program from halting
        try{
            // Java will attempt to execute everything in the block
            // If it runs into an exception it will halt progress in the block and jump to the catch block and
            // execute the logic there
            throwsException();
            System.out.println("Still in the try block here");
        } catch (IOException e){
            System.out.println("Caught an IOException, now the program can keep running");
        } finally {
            // This block will execute even if there was no exception caught. It will always execute at the end after
            // either the try block (if no exception) or catch block (if an exception was caught)
            System.out.println("We're in the finally block");
        }



    }


    // We'll create a simple method down here that throws a checked exception
    // IOException is an input/output exception, commonly occurs when reading from a file or even the terminal
    public static void throwsException() throws IOException{
        throw new IOException();
    }
}
