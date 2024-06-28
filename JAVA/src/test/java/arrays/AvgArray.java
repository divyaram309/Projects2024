package arrays;

public class AvgArray {
	public static void main(String[] args) {
		int a[] = {10,20};
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
		}
		float avg = (float) sum/a.length;
		System.out.println(avg);
	}
}
