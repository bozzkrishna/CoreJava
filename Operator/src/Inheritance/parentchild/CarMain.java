package Inheritance.parentchild;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AudiQ8 a1=new AudiQ8();
		a1.setPrice(99999);
		a1.setBrand("Audi");
		a1.setModel("Q8");
		a1.setColor("Red");
		a1.setType("Petrol");
		a1.wheels();
		a1.light();
		a1.wiper();
		a1.warm();
		System.out.println(a1.getPrice()+" "+a1.getModel());
		

	}

}
