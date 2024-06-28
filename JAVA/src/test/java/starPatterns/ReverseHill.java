package starPatterns;

public class ReverseHill {
    //    public static void printPattern(int n) {
//        int i, j;
//        // outer loop to handle rows
//        for (i = 1; i <= n; i++) {
//
//            // inner loop to print spaces.
//            for (j = 1; j < i; j++) {
//                System.out.print(" ");
//            }
//
//            // inner loop to print value of j.
//            for (j = i; j <= n; j++) {
//                System.out.print(j + " ");
//            }
//
//            // printing new line for each row
//            System.out.println();
//        }
//    }
//
//    // Driver Function
//    public static void main(String args[]) {
//        int n = 6;
//        printPattern(n);
//    }
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print the first half of the stars
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            // Print the second half of the stars
            for (int j = i + 1; j < n; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}




