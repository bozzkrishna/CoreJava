package constructor;

public class EmpMain {
	static int a;
	int b=50;
	static
	{
		a=100;
		System.out.println("Static block 1");
	}
	static
	{
		System.out.println("static block 2 "+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp.adutorium();
		Emp obj=new Emp(111,80000,"Jay");
		Emp obj1=new Emp(112,80000,"JK");
		System.out.println(obj);
		System.out.println(obj1);
	

	}

}
