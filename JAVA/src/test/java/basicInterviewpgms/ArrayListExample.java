package basicInterviewpgms;

import java.util.ArrayList;

//A resizable collection part of Java's Collections framework.
// It can dynamically grow and shrink and holds only objects.
public class ArrayListExample {
    public static void main(String[] args) {
        // Step 1: Declare and initialize an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>(); // Creates an empty ArrayList

        // Step 2: Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Step 3: Print each element in the ArrayList using a loop
        System.out.println("Elements in the ArrayList:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Element at index " + i + ": " + fruits.get(i));
        }

        // Step 4: Remove an element from the ArrayList
        fruits.remove("Banana");
        System.out.println("\nAfter removing 'Banana':");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

