package Inheritance.parentchild;

public class DoctorPatientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p1=new Patient();
		
		p1.setName("Shaan");
		p1.setAge("25");
		p1.setGender("Male");
		p1.setContact("7273747588");
		p1.setBedno("A123");
		p1.setDisease("A1");
		
		
		Doctor d1=new Doctor();
		
		d1.setName("Krishan");
		d1.setSpecialization("Heart");
		d1.setLisence("LIS1");
		
		
	
		p1.display();
		System.out.println(p1.getName()+" "+p1.getAge()+" "+p1.getDisease()+" "+p1.getBedno()+"\n");
		d1.display();
		System.out.println(d1.getName()+" "+d1.specialization+" "+d1.getLisence());

	}

}
