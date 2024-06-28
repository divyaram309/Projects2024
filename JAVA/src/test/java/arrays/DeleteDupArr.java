package arrays;

public class DeleteDupArr {
	public static void main(String[] args) {
		int a[] = {1,3,5,1,3,7,7};
		int temp;
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length-1; j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		int b[] = new int[a.length];
		int k =0;
		for(int l=0; l<a.length-1; l++)
		{
			if(a[l]!=a[l+1])
			{
				b[k]=a[l];
				k++;
			}
		}
		b[k]= a[a.length-1];
		
		for(int i=0; i<=k; i++)
		{
			System.out.println(b[i]);
		}
	}
}
