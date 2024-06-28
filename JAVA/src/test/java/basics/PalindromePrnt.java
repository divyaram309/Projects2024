package basics;

public class PalindromePrnt{
	public static void main(String[] args) {
		for(int num=1; num<=1000; num++)
		{
			int temp=num,rem,rev=0;
			while (temp>0) {
				rem = temp%10;
				temp = temp/10;
				rev = rev*10+rem;
			}
			if(rev==num)
				System.out.print(num+" ");
		}
	}
}
