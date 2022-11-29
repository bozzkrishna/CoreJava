import java.util.Scanner;

public class Primnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,m=0,j=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Num:");
		n=sc.nextInt();
		m=n/2;
		if(n==0 || n==1)
		{
			System.out.println("Not a Prime");
		}else {
			for(i=2; i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println("Not a Prime");
					j=1;
					break;
				}
			}
			if (j==0)
			{
				System.out.println("Prime");
			}
		}
		

	}

}
