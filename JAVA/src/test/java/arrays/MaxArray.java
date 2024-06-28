package arrays;

public class MaxArray {
	public static void main(String[] args) {
		int a[] = {10,40,20,30};
		int max=a[0];
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("Maximum array is "+max);
	}
}
