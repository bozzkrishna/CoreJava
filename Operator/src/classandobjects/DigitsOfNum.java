package classandobjects;

import java.util.Scanner;

public class DigitsOfNum {
	
	
	
	public void pro()
	{
	int num,i,a,c=0;
	System.out.println("enter the Num :");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();

	for(i=0; i<=9; i++)
	{
		int temp=a,cnt=0;
		while(temp!=0)
		{
			int r=temp%10;
			if(r==i)
			{
				cnt++;
			}
			temp=temp/10;
		}
		if(cnt>0)
			System.out.println(i+" - "+cnt);
	}
	}
	public void add()
	{
	int digit,i,a,sum=0;
	System.out.println("enter the Num :");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();

	while(a>0)
	{
		digit=a%10;
		sum=digit+sum;
		a=a/10;
		
	}
	System.out.println(sum);
	}
	public void fre()
	{
	int num,i,a,c=0;
	System.out.println("enter the Num :");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();

	for(i=0; i<=9; i++)
	{
		int temp=a,cnt=0;
		while(temp!=0)
		{
			int r=temp%10;
			if(r==i)
			{
				cnt++;
			}
			temp=temp/10;
		}
		if(cnt>0)
			System.out.println(i+" - "+cnt);
	}
		
	}

}
