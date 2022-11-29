import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c,d;
		System.out.println("Enter The A,B,C,D Value :");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		if(a>b && a>c && a>d)
		{
			System.out.println("Greatest Number is :\t"+a);
		}
		if(b>a && b>c && b>d)
		{
			System.out.println("Greatest Number is :\t"+b);
		}
		if(c>a && c>b && c>d)
		{
			System.out.println("Greatest Number is :\t"+c);
		}
		else
		{
			System.out.println("Greatest Number is :\t"+d);
		}
	}

}
