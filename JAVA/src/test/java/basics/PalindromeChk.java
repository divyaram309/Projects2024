package basics;

public class PalindromeChk{
	public static void main(String[] args) {
		int num=123,rem,rev=0,temp=num;
		while (temp>0) {
			rem = temp%10;
			temp= temp/10;
			rev=rev*10+rem;
		}
		if(rev==num)
			System.out.println(num+" is a palindrome");
		else
			System.out.println(num+" is not a palindrome");
	}
}
