import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j;
		System.out.println("Enter the Num:");
		Scanner sc=new Scanner(System.in);
		int r =sc.nextInt();
		for(i=1; i<=r; i++)
		{
			for(j=1; j<=i; j++)
			{
				if(j%2==0)
				{
					
				}
				else
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
