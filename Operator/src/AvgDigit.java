import java.util.Scanner;

public class AvgDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0,o=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num :");
		n=sc.nextInt();
		
		while(n>0)
		{
			int digit=n%10;
			
			if(digit%2==0)
			{
			sum=sum+digit;
			}
			else
			{
				o=o+digit;
			}
			n=n/10;
		

	}
		System.out.println(sum);
		System.out.println(o);
	}

}
