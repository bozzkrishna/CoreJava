package classandobjects;

import java.util.Scanner;

public class PatternObj {
	void dwonStarPattern()
	{
		for(int i=4; i>=1; i--)
		{
			for(int j=i; j<4;j++)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=(2*i-1);j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void numPattern()
	{
		for(int i=4; i>=1; i--)
		{
			for(int j=i; j<4;j++)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=(2*i-1);j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Choice : \n1.Num Pattern \n2.Star Pattern");
		int ch=sc.nextInt();
		
		PatternObj obj1=new PatternObj();
		
		switch(ch)
		{
		case 2:
			obj1.dwonStarPattern();
			break;
		case 1:
			obj1.numPattern();
			
		}
		
		

	}

}
