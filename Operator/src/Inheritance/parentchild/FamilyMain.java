package Inheritance.parentchild;

public class FamilyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s=new Son();
		s.setName("Krishna");
		s.setAge(25);
		System.out.println(s.getName()+" "+s.getAge());

		s.education();
		s.address();
		
		Daughter d=new Daughter();
		d.setName("Jaya");
		d.setAge(22);
		System.out.println(d.getName()+" "+d.getAge());

		d.education();
		d.address();
	}

}
