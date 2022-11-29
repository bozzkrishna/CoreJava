import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c,d=0,end,sum=0;
		System.out.println("Enter the Start and End :");
		Scanner sc=new Scanner(System.in);
		c=sc.nextInt();
		end=sc.nextInt();
		while(c<=end)
		{
			if(c%2==0) {
				sum=sum+c;
				c++;
				
			}
			
			else
			{
				d=d+c;
				c++;
			}
			
		}
		
		System.out.println("Addition is : "+sum);
		System.out.println("Addition is 2:"+d);

	}

}
