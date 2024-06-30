
package dataStructures;

//A HashMap is a data structure that stores key-value pairs.
// It uses hashing to store and retrieve elements quickly.
// Each key must be unique, and the HashMap allows null values and one null key

public class HashMap { // Renamed to avoid conflict with java.util.HashMap
    public static void main(String[] args) {
        // Creating a HashMap to store student grades
        java.util.HashMap<String, Integer> studentGrades = new java.util.HashMap<>();

        // Adding key-value pairs
        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 92);
        studentGrades.put("Charlie", 78);

        // Accessing values
        System.out.println("Alice's Grade: " + studentGrades.get("Alice")); // Output: Alice's Grade: 85

        // Updating a value
        studentGrades.put("Bob", 88);
        System.out.println("Updated Bob's Grade: " + studentGrades.get("Bob")); // Output: Updated Bob's Grade: 88

        // Removing a key
        studentGrades.remove("Charlie");
        System.out.println("Charlie's Grade: " + studentGrades.get("Charlie")); // Output: Charlie's Grade: null

        // Iterating through HashMap
        for (String name : studentGrades.keySet()) {
            System.out.println(name + "'s Grade: " + studentGrades.get(name));
        }
        // Output:
        // Alice's Grade: 85
        // Bob's Grade: 88
    }
}
