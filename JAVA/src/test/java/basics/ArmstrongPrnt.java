package basics;

public class ArmstrongPrnt {
	public static void main(String[] args) {
		for(int num=1; num<=1000; num++)
		{
			int temp=num,rem,arm=0;
			while (temp>0) {
				rem =temp%10;
				temp =temp/10;
				arm =arm+rem*rem*rem;
			}
			if(arm==num)
				System.out.print(num+" ");
		}
	}
}
