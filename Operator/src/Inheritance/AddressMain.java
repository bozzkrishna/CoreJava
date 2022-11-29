package Inheritance;

public class AddressMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Name,Num,Add
		
		
		Address a1=new Address();
		a1.setArea("Sivaji Nagar");
		a1.setCity("Chennai");
		a1.setState("Tamil Nadu");
		a1.setPincode(6210001);
		
		Personal p1=new Personal ();
		p1.setName("JK");
		p1.setNum(87654321);
		p1.setAdd(a1);
		
		System.out.println("\nName :"+p1.getName()+"\nNumber :"+p1.getNum()+"\n\nAdd :"+
				"\n\nArea :"+p1.getAdd().getArea()+"\nCity :"+p1.getAdd().getCity()+"\nState :"+p1.getAdd().getState()+"\nPincode :"+p1.getAdd().getPincode());
	}

}
