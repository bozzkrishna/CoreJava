package classandobjects;

import java.util.Scanner;

public class MovieLoop {
	int id,year;
	String name,producer;
	void setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Details (ID,Year,Name,Producer):");
		id=sc.nextInt();
		year=sc.nextInt();
		name=sc.next();
		producer=sc.next();
		
	}
	void display()
	{
		System.out.println("Name :"+name+"\nYear :"+year+"\nID :"+id+"\nProducer :"+producer+"\n\n");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieLoop m1=new MovieLoop();
		m1.setData();
		MovieLoop m2=new MovieLoop();
		m2.setData();
		m1.display();
		m2.display();

	}

}
