package basicInterviewpgms;

public class PrintNumInString {
    public static void main(String[] args) {
        String s = "123divya143manju";
        String s1 = "";

        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            if (c >= '0' && c <= '9')
                s1 = s1 + c;

        }
        System.out.println(s1);
    }
}
