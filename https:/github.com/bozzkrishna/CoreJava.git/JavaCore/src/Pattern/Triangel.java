package Pattern;
import java.util.Scanner;
public class Triangel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cnt = 1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		int n =sc.nextInt();
		for (int i=0; i<=n; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print((char)(cnt +64)+" ");
				cnt++;
			}
			System.out.println("");
		}
	}

}
