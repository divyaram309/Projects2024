package starPatterns;

public class HillPattern {
    //    public static void printPattern(int n) {
//        int i, j;
//        // outer loop to handle rows
//        for (i = 0; i < n; i++) {
//            // inner loop to print spaces.
//            for (j = n - i; j > 1; j--) {
//                System.out.print(" ");
//            }
//
//            // inner loop to print stars.
//            for (j = 0; j <= i; j++) {
//                System.out.print("* ");
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
    /// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>2
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}