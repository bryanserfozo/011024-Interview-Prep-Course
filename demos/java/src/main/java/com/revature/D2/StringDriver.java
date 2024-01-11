package com.revature.D2;

public class StringDriver {

    public static void main(String[] args) {
        // Some notes on strings and arrays I want to cover

        // String are arrays of characters that are IMMUTABLE meaning they cannot be changed!

        String example = "Hello World";

        // If I attempt to append something on to the end of the string I'm not altering the string object itself
        // I'm creating a brand-new object

        example += "!";

        System.out.println(example);

        // In most scenarios this really isn't too big of a deal but it is technically less efficient (both memory wise
        // and computationally) if we're creating and updating strings frequently

        // To solve this inefficiency there are two classes we can use
        // StringBuilder and StringBuffer
        // Both of these are ways to create mutable representations of Strings that are more efficient than just
        // creating new object constantly. The only difference is that StringBuffer is threadsafe and StringBuilder is
        // not (if you don't know what threadsafe is, don't worry too much)

        StringBuilder stringBuilder = new StringBuilder("Hello World");
        stringBuilder.append("!");
        String result = stringBuilder.toString();

        System.out.println(result);
    }
}
