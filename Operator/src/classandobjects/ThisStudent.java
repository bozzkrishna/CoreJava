package classandobjects;

import java.util.Scanner;

public class ThisStudent {
	int id,marks;
	String name,dept;
	void setData(int id,String name,String dept,int marks)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.marks=marks;
	}
	public String toString()
	{
		return id+" "+name+" "+dept+" "+marks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Id,Name,Dept,Marks :");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		String n=sc.next();
		String d=sc.next();
		int m=sc.nextInt();
		ThisStudent obj=new ThisStudent();
		obj.setData(id, n, d, m);
		System.out.println(obj);

	}

}
