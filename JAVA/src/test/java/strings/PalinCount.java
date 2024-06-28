package strings;

public class PalinCount {
	public static void main(String[] args) {
		String s = "mom is on high level";
		String str[] = s.split(" ");
		int count=0;
		for(int i=0; i<str.length; i++)
		{
			String w=str[i],rev="";
			for(int j=w.length()-1; j>=0; j--)
			{
				rev =rev+w.charAt(j);
			}
			if(w.equals(rev))
				count++;
		}
		System.out.println(count);
	}
}
