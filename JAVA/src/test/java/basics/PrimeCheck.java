package basics;

public class PrimeCheck {
	public static void main(String[] args) {
	int num=4,count=0;
	for(int i=1; i<=num; i++)
	{
		if(num%i==0)
			count++;
	}
	if(count==2)
		System.out.println(num+" is a prime");
	else
		System.out.println(num+" is not a prime ");
  }
}
