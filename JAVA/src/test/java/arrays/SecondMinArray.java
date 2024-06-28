package arrays;

public class SecondMinArray {
	public static void main(String[] args) {
		int a[] = {10,30,40,20};
		int min=a[0],smin=a[1];
		for(int i=1; i<a.length; i++)
		{
			if(a[i]<min)
			{
				smin=min;
				min=a[i];
			}
			else if(a[i]<smin)
			{
				smin=a[i];
			}
		}
		System.out.println("Minimum of array is "+min);
		System.out.println("Second minimum of array is "+smin);
			
	}
}
