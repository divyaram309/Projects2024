package basicInterviewpgms;

//A fixed-size, indexed collection of elements of the same type. It cannot change its size once created.
public class Array {
    public static void main(String[] args) {
        // Step 1: Declare and initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50}; // Array of 5 integers

        // Step 2: Print each element in the array using a loop
        System.out.println("Elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Step 3: Access and modify an element by index
        numbers[2] = 35; // Modify the element at index 2
        System.out.println("\nUpdated element at index 2: " + numbers[2]);
    }
}

