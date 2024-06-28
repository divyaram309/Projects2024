package arrays;

public class SecondMaxArray {
	public static void main(String[] args) {
		int a[] = {10,30,20,40};
		int max=a[0],smax=a[1];
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>max)
			{
				smax=max;
				max=a[i];
			}
			else if(a[i]>smax)
			{
				smax=a[i];
			}
		}
		System.out.println("Maximum of array is "+max);
		System.out.println("Second maximum of array is "+smax);
			
	}
}
