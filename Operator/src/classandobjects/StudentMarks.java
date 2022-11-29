package classandobjects;

import java.util.Scanner;

public class StudentMarks {
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
		System.out.println("ID :"+id+"\nName :"+name+"\nDep :"+dept+"\nMark :"+marks);
		System.out.println();
	}
//	float calPer(int m1, int m2, int m3, int m4,int m5)
//	{
//		float total = m1+m2+m3+m4+m5;
//		float per=total/5;
//		System.out.println("Percentage :"+per+"%");
//		return per;
//		
//	}
//	void grade(float per)
//	{
//		if(per>80)
//		{
//			System.out.println("A Grade");
//		}
//		if(per>70 && per<=80)
//		{
//			System.out.println("B Grade");
//		}
//		if(per>60 && per<=70)
//		{
//			System.out.println("C Grade");
//		}
//		if(per>40 && per<=60)
//		{
//			System.out.println("D Grade");
//		}
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StudentMarks obj1=new StudentMarks();
//		System.out.println("Enter the Marks one by one:");
//		int m1,m2,m3,m4,m5;
//		Scanner sc=new Scanner(System.in);
//		m1=sc.nextInt();
//		m2=sc.nextInt();
//		m3=sc.nextInt();
//		m4=sc.nextInt();
//		m5=sc.nextInt();
//		float per=obj1.calPer(m1, m2, m3, m4, m5);
//		obj1.grade(per);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID");
		int id=sc.nextInt();
		System.out.println("Enter Name");
		String name=sc.next();
		System.out.println("Enter Marks");
		int mark=sc.nextInt();
		System.out.println("Enter Dept");
		String dept=sc.next();
		
		StudentMarks s1=new StudentMarks();
		s1.setData(id,name,dept,mark);
		
		System.out.println("Enter ID");
		int id2=sc.nextInt();
		System.out.println("Enter Name");
		String name2=sc.next();
		System.out.println("Enter Marks");
		int mark2=sc.nextInt();
		System.out.println("Enter Dept");
		String dept2=sc.next();
		
		StudentMarks s2=new StudentMarks();
		s2.setData(id2,name2,dept2,mark2);
		
		

		System.out.println("Enter ID");
		int id3=sc.nextInt();
		System.out.println("Enter Name");
		String name3=sc.next();
		System.out.println("Enter Marks");
		int mark3=sc.nextInt();
		System.out.println("Enter Dept");
		String dept3=sc.next();
		
		StudentMarks s3=new StudentMarks();
		s3.setData(id3,name3,dept3,mark3);
	
		s1.display();
		s2.display();
		s3.display();
//		

	}

}
