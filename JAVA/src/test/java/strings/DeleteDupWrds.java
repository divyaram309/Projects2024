package strings;

public class DeleteDupWrds {

	public static void main(String[] args) {
		String s = "we are we are test engineers";
		String str[] = s.split(" ");
		for(int i=0; i<str.length; i++)
		{
			int count=1;
			for(int j=i+1; j<str.length; j++)
			{
				if(str[j].equalsIgnoreCase(str[i]))
				{
					str[j]=" ";
				}
			}
			if(str[i]!=" ")
				System.out.print(str[i]+" ");
		}
	}
}
