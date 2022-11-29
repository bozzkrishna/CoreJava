package Inheritance;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine e1=new Engine ();
		e1.setCom("Audi");
		e1.setPower(1200);
		
		Car c1=new Car();
		c1.setEng(e1);
		c1.setModel(1122);
		c1.setCol("Red");
		
		System.out.println(c1);
		System.out.println(e1);
		System.out.println("\nName :"+c1.getModel()+"\nCol :"+c1.getCol());
		System.out.println("Eng Detail :"+c1.getEng().getCom()+"\nPower :"+c1.getEng().getPower());

	}

}
