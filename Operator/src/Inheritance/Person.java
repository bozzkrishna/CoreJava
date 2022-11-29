package Inheritance;

public class Person {
	int age,con;
	String name;
	Id idp;
		Person(int age, String name,int con, Id idp)
		{
		this.age=age;
		this.name=name;
		this.idp=idp;
		this.con=con;
		}

		public String toString()
		{
			return age+" "+name+" "+idp+" "+con;
		}
	}


