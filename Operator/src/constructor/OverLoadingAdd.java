package constructor;

public class OverLoadingAdd {
	
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	public void add(String a, String b)
	{
		System.out.println(a+b);
	}

	public void add(int a, int b,int c)
	{
		System.out.println(a+b);
	}
	public void add(int a, String b)
	{
		System.out.println(a+b);
	}
	public void add(String a, int b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadingAdd obj=new OverLoadingAdd();
		obj.add(10, 22);
		obj.add("JK", "MK");
		obj.add(10, 20, 30);
		obj.add(10, "JK");
		obj.add("MK", 330);
		

	}

}
