package basicInterviewpgms;

public class CheckPrimeNum {
    public static void main(String[] args) {
        int n = 52;
        boolean isPrime = true;  // Assume n is a prime number

        // Check if n is less than 2 (not prime)
        if (n <= 1) {
            isPrime = false;
        } else {
            // Loop from 2 to n/2
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;  // n is divisible by i, so it's not prime
                    break;  // No need to check further
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }

    }
}
