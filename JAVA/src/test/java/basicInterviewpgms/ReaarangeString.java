package basicInterviewpgms;

public class ReaarangeString {
    public static void main(String[] args) {
        String input = "hi divya";
        String[] parts = input.split(" ");
        StringBuilder output = new StringBuilder();

        for (String part : parts) {
            output.insert(0, new StringBuilder(part).reverse().append(" "));
        }

        System.out.println(output.toString().trim()); // Output will be "ayvid ih"
    }
}


