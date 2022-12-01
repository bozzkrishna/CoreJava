package JavaCore;

import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int salary,hra=0,da=0,gs=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Salary :");
salary =sc.nextInt();
if(salary<=10000)
{
	hra = (20/100)*salary;
	da = (80/100)*salary;
	gs = hra+da+salary;
	System.out.println("Gross Salary A :"+gs);
}
else if ( salary<=20000)
{
	hra = (25/100)*salary;
	da = (89/100)*salary;
	gs = hra+da+salary;
	System.out.println("Gross Salary B :"+gs);
}
else 
{
	hra = (30/100)*salary;
	da = (95/100)*salary;
	gs = hra+da+salary;
	System.out.println("Gross Slary C :"+gs);
}
	}

}
