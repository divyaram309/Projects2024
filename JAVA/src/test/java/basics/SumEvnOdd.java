package basics;

public class SumEvnOdd {
	public static void main(String[] args) {
		int num=125,rem,rev=0,sumE=0,sumO=0,temp=num;
		while(temp>0)
		{
			rem =temp%10;
			temp=temp/10;
			rev=rev*10+rem;
			if(rem%2==0)
			{
				sumE=sumE+rem;
			}
			else
			{
				sumO=sumO+rem;
			}
		}
		if(rev==num)
		{
			System.out.println("number is palindrome and even digit sum is "+sumE);
		}
		else
		{
			System.out.println("number is not a palindrome and odd digit sum is "+sumO);
		}
	}
}
