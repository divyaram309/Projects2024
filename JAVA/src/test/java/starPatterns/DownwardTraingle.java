package starPatterns;

import java.util.Scanner;

public class DownwardTraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input
        System.out.print("enter number"); // Prompt the user to enter a number
        int n = sc.nextInt(); // Read an integer input from the user
        for (int i = 0; i <= n; i++) { // Outer loop runs from 0 to n (inclusive)
            for (int j = i; j < n; j++) { // Inner loop runs from i to n-1
                System.out.print("*"); // Print an asterisk
            }
            System.out.println(); // Move to the next line after inner loop completes
        }

    }
}
//o/p:
//*****
//****
//***
//**
//*