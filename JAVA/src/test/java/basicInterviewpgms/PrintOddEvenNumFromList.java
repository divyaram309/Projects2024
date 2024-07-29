package basicInterviewpgms;

public class PrintOddEvenNumFromList {
    public static void main(String[] args) {
        // Define the string of numbers
        String num = "14,3,6,78,99,10";

        // Split the string by commas to get an array of numbers in string format
        String[] numArray = num.split(",");

        // Iterate through each number in the array
        for (String number : numArray) {
            // Convert the string number to an integer
            int num1 = Integer.parseInt(number);

            // Check if the number is even or odd and print accordingly
            if (num1 % 2 == 0) {
                System.out.println("EVEN: " + num1);
            } else {
                System.out.println("ODD: " + num1);
            }
        }
    }
}
