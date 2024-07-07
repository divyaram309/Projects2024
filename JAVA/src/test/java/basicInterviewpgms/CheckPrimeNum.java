package basicInterviewpgms;

public class CheckPrimeNum {
    public static void main(String[] args) {
        int n = 19;
        int result = 0;
        for (int i = 2; i < i % 2; i++) {
            if (n % i == 0) {
                result++;
            }
        }
        if (result == 0)
            System.out.println(n + "prime");
        else
            System.out.println(n + "not prime");
    }
}
