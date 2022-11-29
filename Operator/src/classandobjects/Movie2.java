package classandobjects;

import java.util.Scanner;

public class Movie2 {
	int id,year,price;
	String name,brand;
	void setData(int i,int y, int p, String n,String b)
	{
		id=i;
		year=y;
		price=p;
		name=n;
		brand=b;
		}
//	void display()
//	{
//		System.out.println("Name :"+name+"\nYear :"+year+"\nID :"+id+"\nProducer :"+producer+"\n\n");
//		
//	}
	public String toString()
	{
		return "Price :"+price+"\nName :"+name+"\nYear :"+year+"\nID :"+id+"\nBrand :"+brand+"\n\n";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Details (ID,Year,Price,Name,Brand):");
		int id=sc.nextInt();
		int year=sc.nextInt();
		int price=sc.nextInt();
		String name=sc.next();
		String brand=sc.next();
		Movie2 m1=new Movie2();
		m1.setData(id,year,price, name,brand);
		
		System.out.println("Enter the Details (ID,Year,Price,Name,Brand):");
		id=sc.nextInt();
		year=sc.nextInt();
		price=sc.nextInt();
		name=sc.next();
		brand=sc.next();
		Movie2 m2=new Movie2();
		m2.setData(id,year,price,name,brand);

		System.out.println(m1);
		System.out.println(m2);
//		m1.display();
//		m2.display();
	}
	

	
}
