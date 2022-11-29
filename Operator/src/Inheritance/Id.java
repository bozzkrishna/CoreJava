package Inheritance;

public class Id {
	 int num;
	String name,add;
	Id(int num, String name, String add)
	{
		this.num=num;
		this.name=name;
		this.add=add;
	}

	public String toString()
	{
		return num+" "+name+" "+add;
	}
}
