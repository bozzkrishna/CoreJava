package Inheritance.parentchild;

public class Marcedes extends Car1 {
	
	static void display()
	{
		System.out.println("display marcedes");
	}
	void dashboard()
	{
		super.dashboard();
		System.out.println("Marcedes ");
		
	}
	void engine()
	{
		System.out.println("3000 cc");
		super.wheelno();
	}

}
