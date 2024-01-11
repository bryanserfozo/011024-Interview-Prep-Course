package com.revature.D2;

import java.util.*;

public class CollectionsDriver {

    public static void main(String[] args) {
        // The Collections Framework is a framework for more complex data structures.
        // Everything in the collection framework implements iterable, meaning we can iterate over it (aka step through
        // each item and do some logic on each step)
        // The main interfaces that are associated with the collection framework are List, Set, Queues
        // Maps get an honorary mention here (not technically part of the collections framework since it doesn't
        // implement iterable) since it's a data structure and is comprised of things from the collection framework

        // We'll take a brief look at lists, sets, and maps (queues aren't used as often so we'll avoid them for now)

        // List
            // Ordered
            // Indexed
            // Dynamically Sized
        // Two major implementations
            // ArrayList
                // Stores info in an array under the hood, will recreate the array if it needs to resize
                // Good for retrieval slightly slower at insertion/deletion
            // LinkedList
                // A series of nodes attached to each other with pointers
                // Good for insertion/deletion, and slower at retrieval


        // This is a good time to use that Liskov principle to declare the collection we want to use so we can switch
        // implementation easily if the need arises


        // Generics <> enforce type safety in collections. They're used with objects so if we want to use a primitive
        // we need to wrap the object in a wrapper class (int -> Integer)
        List<Integer> examScores = new LinkedList<>();

        // We can add items to the list
        examScores.add(91);
        examScores.add(84);
        examScores.add(95);
        examScores.add(91);

        // We can retrieve items as well
        System.out.println(examScores.get(2));

        // We can look at doing the avg thing we did before
        double avg = 0;

        // Enhanced for-loop (things that implement iterable can be used in an enhanced for-loop but they lose the
        // indexing associated with a regular for-loop)
        for (int n : examScores){
            avg += n;
        }
        avg /= examScores.size();

        System.out.println(avg);

        System.out.println("----------------------------");

        // Sets
            // Another data structure often compared to lists
            // Data structure represents a set in the mathematical sense
            // The set has the following properties
                // Unordered / cannot be indexed
                // Does not contain duplicates
                // Grow dynamically in size
            // One major implementation that we'll use
                // HashSet
                    // Create hashes of items (memory efficient storage) to store them

        Set<String> groceryItems = new HashSet<>();

        // We can add items to the list
        groceryItems.add("Milk");
        groceryItems.add("Eggs");
        groceryItems.add("Chocolate");
        groceryItems.add("Avocado Oil");

        // Note: We can add duplicates without causing an exception, but they won't actually be stored
        groceryItems.add("Milk");


        // I can print out the items in the list like so
        for (String s: groceryItems){
            System.out.println(s);
        }



    }
}
