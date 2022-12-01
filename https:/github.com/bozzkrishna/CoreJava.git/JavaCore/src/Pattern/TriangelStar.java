package Pattern;
import java.util.Scanner;
public class TriangelStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k, cnt = 1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		int n =sc.nextInt();
		for (int i=0; i<=n; i++)
		{
			for (k=n-1; k>0; n--)
				
			for (int j=1; j<=i; j++)
			{
				System.out.print("*");
				cnt++;
			}
			System.out.println("");
		}
	}

}
