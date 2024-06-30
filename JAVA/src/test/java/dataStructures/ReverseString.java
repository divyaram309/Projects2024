package dataStructures;

//String reversal involves flipping the sequence of characters from the end to the beginning,
//crucial for tasks involving text manipulation and data transformation.
public class ReverseString {
    public static void main(String[] args) {
        // Original string to be reversed
        String original = "Java is fun!";

        // Calling the method to reverse the string
        String reversed = reverseString(original);

        // Printing the original and reversed strings
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed); // Output: Original: Java is fun!, Reversed: !nuf si avaJ
    }

    /**
     * Reverses the input string.
     *
     * @param str The string to be reversed.
     * @return The reversed string.
     */
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i)); // Append each character from end to start
        }
        return reversed.toString();
    }
}


