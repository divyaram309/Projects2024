package arrays;

public class SumArray {
	public static void main(String[] args) {
		int a[] = {40,60,50,50};
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			sum = sum+a[i];
		}
		System.out.println(sum);
	}
}
