package arrays;

public class DiffMaxMinArr {
	public static void main(String[] args) {
		int a[] = {10,30,40,20};
		int max=a[0],min=a[0];
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>max)
				max=a[i];
			else if(a[i]<min)
				min=a[i];
		}
		int diff = max-min;
		System.out.println("the difference of max and min in array is "+diff);
	}
}
