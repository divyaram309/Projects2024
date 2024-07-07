package basicInterviewpgms;

public class DuplicateChar {
    public static void main(String argu[]) {
        // Input string
        String str = "w3schools";
        // Counter to track duplicate characters found
        int cnt = 0;
        // Convert string to character array
        char[] inp = str.toCharArray();

        System.out.println("Duplicate Characters are:");

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Inner loop starts from the next character of outer loop's current character
            for (int j = i + 1; j < str.length(); j++) {
                // Check if characters at position i and j are equal
                if (inp[i] == inp[j]) {
                    // Print the duplicate character found
                    System.out.println(inp[j]);
                    // Increment counter for duplicate characters
                    cnt++;
                    // Break inner loop as soon as a duplicate is found for current character
                    break;
                }
            }
        }
    }
}
