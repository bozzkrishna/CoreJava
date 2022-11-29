package classandobjects;

import java.util.Scanner;

public class CarNew {
	int id,price;
	String name,com;
	CarNew()
	{
		id=-1;
		price=-1;
		name="nnn";
		com="cccc";
		
	}
	
	CarNew(int id, String name,String com,int price)
	{
		this.id=id;
		this.name=name;
		this.com=com;
		this.price=price;
		
		
	}
	void show()
	{
		int a=0, b=0;
		System.out.println(a+" "+b);
		System.out.println(id+" "+name);
	}
	public String toString()
	{
		return id+" "+name+" "+com+" "+price;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Enter Id,Name,Dept,Marks :");
//		Scanner sc=new Scanner(System.in);
//		int id=sc.nextInt();
//		String n=sc.next();
//		String d=sc.next();
//		int m=sc.nextInt();
//		CarNew obj=new CarNew();
//		obj.show();
		System.out.println("Enter ID,Price,Name,Company");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		int price=sc.nextInt();
		String name=sc.next();
		String com=sc.next();
		CarNew obj=new CarNew(id,name,com,price);
		System.out.println(obj);
		

	}

}
