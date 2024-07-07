package basicInterviewpgms;

public class ConvertFirstLetterToUpper {
    public static void main(String[] args) {
        String s1 = "hi manju";
        String s2 = "";
        String[] s3 = s1.split("\\s+"); // Split by whitespace (one or more spaces)

        for (int i = 0; i < s3.length; i++) {
            String word = s3[i];
            if (i == 0) { // First word
                char ch = word.charAt(0);
                char a = Character.toUpperCase(ch);
                String b = word.substring(1);
                s2 = s2 + a + b;
            } else {
                s2 = s2 + " " + word; // Append space and the word as is
            }
        }

        System.out.println(s2);
    }
}
