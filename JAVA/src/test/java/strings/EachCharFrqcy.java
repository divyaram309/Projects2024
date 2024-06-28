package strings;

public class EachCharFrqcy {
	public static void main(String[] args) {
		String s ="We are test engineers".toLowerCase();
		char ch[] = s.toCharArray();
		for(char i='a'; i<='z'; i++)
		{
			int count=0;
			for(char c : ch)
			{
				if(c==i)
			    count++;
			}
			if(count!=0)
			System.out.println(i+"-"+count);
		}
	}
}
