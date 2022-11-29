package constructor;

public class Outer {
	int a=100;
	static int b=200;
	void display()
	{
		System.out.println(a+" "+b);
	}
	static void show()
	{
		System.out.println(" "+b);
		Outer o=new Outer();
		System.out.println(o.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Outer obj=new Outer();
obj.display();
obj.show();
	}

}
