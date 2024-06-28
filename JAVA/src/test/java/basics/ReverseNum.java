package basics;

public class ReverseNum {
	public static void main(String[] args) {
		int num=123,rem,rev=0;
		while (num>0) {
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		System.out.println("Reverse number is "+rev);
	}
}
