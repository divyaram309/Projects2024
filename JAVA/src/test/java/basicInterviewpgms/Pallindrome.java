package basicInterviewpgms;

public class Pallindrome {
    public static void main(String[] args) {
        String s = "dad";
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            rev = rev + ch;
        }
        if (s.equals(rev))
            System.out.println(s + "is pallindrome");
        else
            System.out.println(s + "not a pallindrome");
    }
}

