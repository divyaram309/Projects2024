package basicInterviewpgms;

import java.util.Arrays;

public class Swapping {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        System.out.println("Original Basket A: " + Arrays.toString(a));
        System.out.println("Original Basket B: " + Arrays.toString(b));

        // Swapping the contents of the arrays
        int[] temp = a; // Use a temporary array to hold the contents of basketA
        a = b; // Assign the contents of basketB to basketA
        b = temp; // Assign the contents of the temporary array (original basketA) to basketB

        // Printing the arrays after swapping
        System.out.println("Basket A after swap: " + Arrays.toString(a));
        System.out.println("Basket B after swap: " + Arrays.toString(b));
    }
}

