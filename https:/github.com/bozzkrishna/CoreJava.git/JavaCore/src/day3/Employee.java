package day3;

public class Employee {
			
	int eid;
	String ename;
	float esalary;
	
	
	
			Employee()
			{
			
				this(112,2400000.89f);
				ename="Karthi";
				/* Eid = 111;
				Ename = "Jay";
				Esalary = 500000.00f; */
			}
			
			Employee(int id, float salary)
			{
				eid = id;
				esalary = salary;
			}
			Employee(int eid, String ename, float esalary )
			{
			
				this.eid=eid;
				this.ename=ename;
				this.esalary=esalary;
			}
	void 	ShowDetails()
			{
				System.out.println("ID :"+this.eid);
				System.out.println("E Name :"+this.ename);
				System.out.println("E Salary :"+esalary);
				System.out.println("HRA :"+(esalary/100*35));
				System.out.println("DA :"+(esalary/100*20));
				System.out.println("G Salary :"+(esalary+(esalary/100*35)+(esalary/100*20)));
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee a=new Employee();
		a.ShowDetails();
		
		Employee b=new Employee(121,"Krishna",600000.00f);
		b.ShowDetails();
		

	}

}
