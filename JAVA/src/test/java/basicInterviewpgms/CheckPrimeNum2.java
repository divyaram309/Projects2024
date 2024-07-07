package basicInterviewpgms;

public class CheckPrimeNum2 {
    public static void main(String[] args) {
        int n = 17; // Example number to check

        boolean isPrime = true; // Assume initially that n is prime

        // Corner case: numbers less than or equal to 1 are not prime
        if (n <= 1) {
            isPrime = false;
        } else {
            // Check for factors from 2 to square root of n
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false; // Found a factor other than 1 and n itself
                    break; // No need to check further
                }
            }
        }

        // Output the result
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
