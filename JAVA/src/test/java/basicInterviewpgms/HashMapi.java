package basicInterviewpgms;

import java.util.HashMap;

// is a part of Java's Collections framework that stores key-value pairs.
// It uses a hash table for implementation, providing fast access and retrieval operations
class HashMapi {
    public static void main(String[] args) {

        // create a hashmap
        HashMap<String, Integer> languages = new HashMap<>();

        // add elements to hashmap
        languages.put("Java", 8);
        languages.put("JavaScript", 1);
        languages.put("Python", 3);
        System.out.println("HashMap: " + languages);
    }
}