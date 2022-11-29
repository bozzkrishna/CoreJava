package classandobjects;

import java.util.Scanner;

public class Calcu {

	public void add()
	{
		System.out.println("Enter two Num :");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a+b);
		
	}
	public void sub()
	{
		System.out.println("Enter two Num :");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a-b);
		
	}
	public void mul()
	{
		System.out.println("Enter two Num :");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a*b);
		
	}
	public void div()
	{
		System.out.println("Enter two Num :");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a/b);
		
	}
	
}
