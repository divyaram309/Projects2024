package basicInterviewpgms;


import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 3, 6, 2};

        // Variable to count duplicates (though not strictly necessary for this task)
        int count = 0;

        // Print message for duplicate numbers
        System.out.println("Duplicates are:");

        // Loop through each number in the array
        for (int i = 0; i < numbers.length; i++) {
            // Check each number against all subsequent numbers in the array
            for (int j = i + 1; j < numbers.length; j++) {
                // If a duplicate is found
                if (numbers[i] == numbers[j]) {
                    // Print the duplicate number
                    System.out.println(numbers[j]);
                    // Break the inner loop to avoid printing the same duplicate again
                    break;
                }
            }
        }
    }

}


