package strings;

public class DeleteDupChar {
	public static void main(String[] args) {
		String s = "aabcbade";
		String un="";
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(un.indexOf(ch)==-1)
				un=un+ch;
		}
		System.out.println(un);
	}
}
