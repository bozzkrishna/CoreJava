package classandobjects;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Salary :");
		int sal=sc.nextInt();
		char rat=sc.next().charAt(0);
//		int sal=50000;
//		System.out.println("Your Salary is :"+sal);
		Employee obj1=new Employee();
		int newsal=obj1.hike(sal,rat);
		obj1.pfcal(newsal);
		
		
		
		

	}

}
