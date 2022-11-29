package constructor;

public class Emp {
	int id,salary;
	String name;
	static String com;
	
	static void adutorium()
	{
		System.out.println("Comman to all\n");
	}
static  void input()
	{
		com="Infosys";
	}
	Emp(int id, int salary, String name)
	{
		this.id=id;
		this.salary=salary;
		this.name=name;
		
	}
	public String toString()
	{
		return "ID :"+id+"\nName :"+name+"\nSalary :"+salary+"\nCompany :"+com+"\n";
		
	}

	

}
