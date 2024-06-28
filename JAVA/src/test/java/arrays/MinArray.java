package arrays;

public class MinArray {
	public static void main(String[] args) {
		int a[] = {10,40,20,30};
		int min=a[0];
		for(int i=1; i<a.length; i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("Minimum array is "+min);
	}
}
