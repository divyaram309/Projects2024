package strings;

public class CountWords {
	public static void main(String[] args) {
		String s = "we are test engineers";
		String str[] = s.split(" ");
		int count = str.length;
		for(int i=0; i<str.length; i++)
		{
			if(str[i]==" ")
				count--;
		}
		System.out.println("Word count is "+count);
	}
}
