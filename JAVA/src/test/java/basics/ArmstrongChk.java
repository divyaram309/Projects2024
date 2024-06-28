package basics;

public class ArmstrongChk {
	public static void main(String[] args) {
		int num=153,rem,arm=0,temp=num;
		while (temp>0) {
			rem= temp%10;
			temp =temp/10;
			arm = arm+rem*rem*rem;
		}
		if(arm==num)
			System.out.println(num+" is a armstrong number");
		else
			System.out.println(num+" is not a armstrong");
	}
}
