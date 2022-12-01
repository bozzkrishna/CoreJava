
public class ConstructorMain {
	class A
	{
		A()
		{
			System.out.println( "Class A");
		}
	}
	class B extends A
	{
		B(int a)
		{
		System.out.println(a);
			System.out.println("Class B");
		}
	}
	class C extends B
	{
		C()
		{
			super(10);
			System.out.println("Class C");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		C obj=new C();

	}

}
