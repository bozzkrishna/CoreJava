package constructor;

public class TypeCast {
	
	public void convert(float a)
	{
		int b=(int)a;
		System.out.println("F 2 I :"+b);
	}
	public void convert(double a)
	{
		int b=(int)a;
		System.out.println("D 2 I :"+b);
	}
	public void convert(long a)
	{
		int b=(int)a;
		System.out.println("L 2 I :"+b);
	}
	public void convert(char a)
	{
		int b=(int)a;
		System.out.println("C 2 I :"+b);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypeCast obj=new TypeCast();
		obj.convert(5.66f);
		obj.convert(22.3);
		obj.convert(2233);
		obj.convert('b');

	}

}
