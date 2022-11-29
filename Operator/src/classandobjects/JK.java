package classandobjects;

public class JK {
	JK()
	{
		this(10);
		System.out.println("Inside simple constructor");
	}
	JK(int x)
	{
		this("ABC");
		System.out.println("1 Parameter Constructor");
	}
	JK(int x,int y)
	{
		this("ABX");
		System.out.println("2 Parameter Constructor");
	}
	JK(String z)
	{
//		this(1);
		System.out.println("String parameter constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JK obj=new JK();
System.out.println(obj);
	}

}
