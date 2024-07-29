package basicInterviewpgms;

public class ReverseWordWithCap {
    public static void main(String[] args) { // Main method: entry point of the program
        String s = "Welcome"; // Original string
        String s1 = ""; // Variable to hold the uppercase version of the string
        String rev = ""; // Variable to hold the reversed string

        // Convert the string to a character array
        char[] ch = s.toCharArray();

        // Loop through each character in the array
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i]; // Get the current character

            // Check if the character is a lowercase letter
            if (c >= 'a' && c <= 'z') {
                // Convert it to uppercase
                char up = Character.toUpperCase(c);
                s1 = s1 + up; // Append the uppercase character to s1
            } else {
                // If not lowercase, append the character as it is
                s1 = s1 + c;
            }
        }

        // Print the uppercase version of the string
        System.out.println(s1);

        // Convert the uppercase string to a character array
        char[] ch2 = s1.toCharArray();

        // Loop through the array in reverse order
        for (int i = ch2.length - 1; i >= 0; i--) {
            char revnum = ch2[i]; // Get the current character
            rev = rev + revnum; // Append the character to rev
        }

        // Print the reversed string
        System.out.println(rev);
    }
}

