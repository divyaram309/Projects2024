package strings;

public class LongWord {
	public static void main(String[] args) {
		String s ="we are test engineers";
		String str[] = s.split(" ");
		String max=str[0];
		for(int i=0; i<str.length; i++)
		{
			if(str[i].length()>max.length())
				max=str[i];
		}
		System.out.println("Longest word is: "+max);
	}
}
