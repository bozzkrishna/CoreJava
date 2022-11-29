package constructor;

public class AreaOfShape {
	
	public void area(int a)
	{
		System.out.println("area of Square :"+4*a);
	}
	public void area(float a)
	{
		System.out.println("area of Circle :"+3.14*a*a);
	}
	public void area(int l,int b)
	{
		System.out.println("area of Rectangle :"+l*b);
	}
	public void area(float h, int b)
	{
		System.out.println("area of Triangle :"+h*b/2f);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfShape obj=new AreaOfShape();
		obj.area(4);
		obj.area(5.5f);
		obj.area(4, 5);
		obj.area(2.5f, 5);

	}

}
