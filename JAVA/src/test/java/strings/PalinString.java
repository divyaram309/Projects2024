package strings;

public class PalinString {
	public static void main(String[] args) {
		String s= "mom";
		String rev="";
		for(int i=s.length()-1; i>=0; i--)
		{
			char ch =s.charAt(i);
			rev=rev+ch;
		}
		if(s.equals(rev))
			System.out.println(s+" is a palindrome");
		else
			System.out.println(s+" is not a palindrome");
	}
}
