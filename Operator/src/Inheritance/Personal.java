package Inheritance;

public class Personal {
//	id,num,name,age,address a;

	private int id,num,age;
	Address add;
	private String name;
	public void setAdd(Address add)
	{
		this.add=add;
	}
	public Address getAdd()
	{
		return add;
	}
	public void setId(int id)
	{
		this.id=id;
	
	}
	public int getId()
	{
		return id;
	}
	public void setNum(int num)
	{
		this.num=num;
	
	}
	public int getNum()
	{
		return num;
	}
	public void setName(String name)
	{
		this.name=name;
	
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int age)
	{
		this.age=age;
	
	}
	public int getAge()
	{
		return age;
	}
	
//	public String toString()
//	{
//		return "\nName :"+name+"\nContact :"+num;
//	}
}
