package basicInterviewpgms;

public class AcendingOrder {
    // Ascending order in array
    public static void main(String[] args) { // Main method: entry point of the program
        int[] ar = new int[5]; // Declare an array of 5 integers

        // Initialize the array with values
        ar[0] = 800;
        ar[1] = 500;
        ar[2] = 200;
        ar[3] = 400;
        ar[4] = 100;

        // Outer loop: iterate over the array elements
        for (int i = 0; i < ar.length; i++) {
            // Inner loop: iterate from the next element to the end of the array
            for (int j = i + 1; j < ar.length; j++) {
                // Compare the current element with the next element
                if (ar[i] > ar[j]) {
                    // Swap the elements if they are in the wrong order
                    int temp = ar[i]; // Temporary variable to hold the value of ar[i]
                    ar[i] = ar[j]; // Assign the value of ar[j] to ar[i]
                    ar[j] = temp; // Assign the value of temp (original ar[i]) to ar[j]
                }
            }
        }

        // Loop through the sorted array and print each element
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]); // Print the current element of the array
        }
    }
}


