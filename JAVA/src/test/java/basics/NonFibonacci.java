package basics;

public class NonFibonacci {
	public static void main(String[] args) {
		int a=0,b=1,c=0,d=0,n=10;
		while(c<=n)
		{
			c=a+b;
			a=b;
			b=c;
			d=a+b;
			
			for(int i=c+1;i<d;i++)
			{
				if(i<=n)
				{
					System.out.print(i+" ");
				}
			}
		}
	}
}
