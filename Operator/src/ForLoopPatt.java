import java.util.Scanner;

public class ForLoopPatt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,r;
		
		System.out.println("Enter the Row :");
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		for(i=1; i<=r; i++)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(i=1; i<=r; i++)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		for(i=1; i<=r; i++)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		
		for(i=1; i<=r; i++)
		{
			char h='a';
			for(j=1; j<=i; j++)
			{
				System.out.print(h);
				h++;
			}
			System.out.println();
		}
		System.out.println();
		char h='a';
		for(i=1; i<=r; i++)
		{
			
			for(j=1; j<=i; j++)
			{
				System.out.print(h);
				
			}
			System.out.println();
			h++;
		}
		System.out.println();
		char k,ch,l;
		System.out.println("Enter ch:");
		ch=sc.next().charAt(0);
		for(k='a'; k<=ch; k++)
		{
			for(l='a'; l<=k; l++)
			{
				System.out.print(l);
			}
			System.out.println();
		}
		System.out.println();
		for(k='a'; k<=ch; k++)
		{
			for(l='a'; l<=k; l++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
		System.out.println();



	}

}
