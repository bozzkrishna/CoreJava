package classandobjects;

import java.util.Scanner;

public class StudentLoop  {
		int id,marks;
		String name,dept;
		void setData(int i,String n,String d,int m)
		{
			id=i;
			name=n;
			dept=d;
			marks=m;
		}
		void display()
		{
			System.out.println();
			System.out.println("ID :"+id+"\nName :"+name+"\nDep :"+dept+"\nMark :"+marks+"\n\n");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Num Of Studen :");
		int num=sc.nextInt();
		for(int i =1; i<=num;i++) 
		{
		
		System.out.println("Enter ID :");
		int id=sc.nextInt();
		System.out.println("Enter Name :");
		String name=sc.next();
		System.out.println("Enter Marks :");
		int mark=sc.nextInt();
		System.out.println("Enter Dept :");
		String dept=sc.next();
		
		StudentLoop s=new StudentLoop();
		s.setData(id,name,dept,mark);
		s.display();
		}

	}

}
