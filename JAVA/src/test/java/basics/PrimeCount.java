package basics;

public class PrimeCount {
	public static void main(String[] args) {
		int countP=0;
		for(int num=1; num<=15; num++)
		{
			int count=0;
			for(int i=1; i<=num; i++)
			{
				if(num%i==0)
					count++;
			}
			if(count==2)
				countP++;
		}
		System.out.println("Prime count is "+countP);
	}
}
